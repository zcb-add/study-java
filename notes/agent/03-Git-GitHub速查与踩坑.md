# Git 与 GitHub · 速查表 + 真实踩坑

> git 是找工作的**肌肉记忆**，面试和日常开发天天用。
> 这张表 + 真实踩坑记录，够你用很久。

---

## 一、日常三连（🟥 必背，天天用）

```bash
git add -A              # 把所有改动放进暂存区
git commit -m "feat: 干了啥"   # 打个标签封箱
git push                # 推到 GitHub
```

**比喻**：`add` = 把东西装进快递箱；`commit` = 贴标签封箱；`push` = 叫快递员寄走。

## 二、常用命令速查

| 命令 | 作用 | 什么时候用 |
|---|---|---|
| `git status` | 看当前改动状态 | 每次动手前先看一眼 |
| `git log --oneline` | 看提交历史 | 回顾/写周报 |
| `git diff` | 看具体改了什么 | 提交前检查 |
| `git pull` | 拉取远程更新 | 和别人协作/换电脑 |
| `git clone <地址>` | 复制一个远程仓库 | 在别处用这个项目 |
| `git branch` | 看分支 | 确认自己在 main |
| `git remote -v` | 看远程地址 | 确认连的是哪个仓库 |

## 三、commit 信息规范（🟥 大厂要求）

```
feat:    新功能        （新增工具、新模块）
fix:     修 bug
docs:    文档          （README、笔记）
test:    测试          （加测试用例）
chore:   杂务/配置     （脚手架、依赖、gitignore）
```
示例：`feat: 注册 10 个工具（文件/计算/网络/天气/记忆）`

## 四、推送一个新项目（全流程）

```bash
git init -b main                       # 1. 初始化（默认分支 main）
git add -A && git commit -m "..."      # 2. 第一次提交
# 3. 网页上建好空仓库后：
git remote add origin https://github.com/用户名/仓库名.git   # 4. 关联远程
git push -u origin main                # 5. 推送（-u 记住关联，以后直接 push）
```

## 五、★ 真实踩过的 4 个坑（每个都是学费）

### 坑 1：Windows 中文乱码 🟨
**现象**：Python 打印中文乱码 `Ã¤Â½...`
**原因**：Windows 终端默认 GBK，Python 输出 UTF-8
**解法**：`sys.stdout.reconfigure(encoding="utf-8")`（`cli.py` 开头已写）

### 坑 2：GitHub 被墙 🟥 必知
**现象**：`Failed to connect to github.com:443`，一直超时
**原因**：国内网络连 GitHub 的端口被墙
**解法**：开代理（你的 Clash Verge 端口是 **127.0.0.1:7897**），并给 git 配代理：
```bash
git config --global http.https://github.com.proxy http://127.0.0.1:7897
git config --global http.https://api.github.com.proxy http://127.0.0.1:7897
```
> 只对 GitHub 走代理，不影响其他仓库。用 GitHub 前确认代理是开着的。

### 坑 3：用户名拼写错了 🟥 最容易犯
**现象**：`remote: Repository not found`，仓库明明建了
**原因**：GitHub 用户名是 **zcb-add**（连字符），我一开始写成了 `zcb_add`（下划线）
**排查**：检查浏览器地址栏里仓库的真实 URL，改 `git remote set-url`
```bash
git remote set-url origin https://github.com/真实用户名/真实仓库名.git
```

### 坑 4：认证弹窗 🟨
**现象**：`git push` 卡住，或 `fatal: could not read Username`
**原因**：本地没有存 GitHub 凭据，git 弹出登录窗口（被取消就失败）
**解法**：
- 弹出 "Git Credential Manager" 窗口时，点 **Sign in with your browser** 完成登录
- 或者创建 **Personal Access Token（PAT）**：GitHub → Settings → Developer settings → Personal access tokens → 生成（勾选 `repo` scope），用令牌认证

### 坑 5：独立仓库被外层仓库"卷进去" 🟨
**现象**：`D:\Dev\agent-assistant` 自己有个 `.git`，而 `D:\Dev` 也是个仓库 → 在外层 `git add -A` 会把它当子模块
**解法**：在外层 `.gitignore` 加一行 `agent-assistant/`（已帮你加好）

---

## 六、判断标准：什么叫"会 git"了？

- ✅ 能独立完成：改代码 → `status` 看一眼 → `add` → `commit` → `push`
- ✅ 报错了能看懂（`Repository not found` = 仓库名/账号问题；`Could not connect` = 网络/代理问题）
- ✅ 知道 `.gitignore` 挡什么、`.env` 为什么不能提交

> 目标：这套流程练到**闭着眼睛**能敲出来。
