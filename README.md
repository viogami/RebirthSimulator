# RebirthSimulator

![java](https://img.shields.io/badge/language-java-blue)
![API](https://img.shields.io/badge/API-29-blue)

这是一个转生模拟器

通过抽卡获得具备相关属性的角色以此来执行“转生”的文字游戏。
| :exclamation:仅作AS学习使用，不进行传播<br>文本内容部分引用网络，侵删<br>Only for personal，never spread it.The context is partially referenced by the Internet.<br>If tort I will delete this. |
| ------------------------------------------------------------------------------------------------------------------------- |

主要使用Android Studio进行开发，版本号：11.0.12

## 项目说明
### 框架构成
通过使用三个fragment，实现具有底部三个调转栏的功能，分别为图鉴，抽卡和转生。由上角添加菜单栏添加设置和退出功能。设置中可以查看简要的账号信息，同时配有清除数据按钮和注销按钮。用户登陆不需要密码，只需要用户名即可，用来保存获得的卡片和转生的次数。
### 卡片和货币
卡片品质分为[Max][S][A][B][C]三种，每种品质的卡对应相应rank的属性。图鉴界面会展示所有可以抽到的卡片，但均为灰色，若在抽卡界面抽到后，图鉴界面相应的将卡片颜色点亮。同时图鉴界面可以通过一个下拉按钮查看卡片的相关属性。
货币用于执行抽卡和调整部分卡片天赋属性，也为后期游戏加入更多元素留下基础。暂定使用“水晶“进行抽卡，水晶数量目前可以随意修改，同时未命名两种货币。
### 转生 
转生界面通过选择拥有的卡片执行转生，点击屏幕将会出现文本描述相关的角色概况，从角色出生到角色死亡。在一些选项中分化出选择支，可以改变人物的结果。在每次游戏之后可以点击“人生总结“按钮，查看简要的记录的转生结果，同时为卡片人物的部分属性进行修改和调整，如”经历的转生数“，”既视感触发度“等。


## 功能列表与计划
- [x] 数据库
- [x] 弹窗功能
- [x] 抽卡
  - [x] 单抽
  - [ ] 十连
  - [ ] 可控改变概率
  - [x] 自定义部分货币数
  - [x] 显示保底次数
  - [x] 链接到图鉴
  - [x] 链接到转生
- [x] 图鉴
  - [x] 显示全部卡片
  - [x] 显示拥有的卡片
  - [x] 区分卡片是否拥有
  - [x] 根据rank显示相应颜色
  - [x] 购买卡片 
- [x] 转生
  - [x] 显示文本
  - [x] 关联卡片
  - [x] 选择分支
  - [ ] 人生总结
  - [ ] 天赋继承
- [x] 菜单
  - [x] 登陆
  - [x] 设置
  - [x] 关于
- [x] 设置
  - [x] 重置数据
  - [x] 删除账号
- [x] 用户界面
  - [x] 注销
  - [x] 登陆
  - [x] 注册
  
  

