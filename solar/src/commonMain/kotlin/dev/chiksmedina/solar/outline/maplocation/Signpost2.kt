package dev.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.Signpost2: ImageVector
    get() {
        if (_signpost2 != null) {
            return _signpost2!!
        }
        _signpost2 = Builder(
            name = "Signpost2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 7.0f)
                curveTo(8.25f, 6.5858f, 8.5858f, 6.25f, 9.0f, 6.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 6.25f, 15.75f, 6.5858f, 15.75f, 7.0f)
                curveTo(15.75f, 7.4142f, 15.4142f, 7.75f, 15.0f, 7.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 7.75f, 8.25f, 7.4142f, 8.25f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 15.25f)
                curveTo(8.5858f, 15.25f, 8.25f, 15.5858f, 8.25f, 16.0f)
                curveTo(8.25f, 16.4142f, 8.5858f, 16.75f, 9.0f, 16.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 16.75f, 15.75f, 16.4142f, 15.75f, 16.0f)
                curveTo(15.75f, 15.5858f, 15.4142f, 15.25f, 15.0f, 15.25f)
                horizontalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(2.75f)
                lineTo(6.6064f, 2.7499f)
                curveTo(6.0444f, 2.7495f, 5.6012f, 2.7492f, 5.1838f, 2.885f)
                curveTo(5.0008f, 2.9446f, 4.8245f, 3.0232f, 4.6579f, 3.1196f)
                curveTo(4.278f, 3.3394f, 3.9821f, 3.6693f, 3.607f, 4.0878f)
                lineTo(3.5178f, 4.1872f)
                curveTo(3.1129f, 4.6381f, 2.7733f, 5.0162f, 2.5262f, 5.3517f)
                curveTo(2.2664f, 5.7042f, 2.0639f, 6.0672f, 1.9839f, 6.4998f)
                curveTo(1.9227f, 6.8305f, 1.9227f, 7.1695f, 1.9839f, 7.5002f)
                curveTo(2.0639f, 7.9328f, 2.2664f, 8.2958f, 2.5262f, 8.6483f)
                curveTo(2.7733f, 8.9838f, 3.1128f, 9.3619f, 3.5178f, 9.8128f)
                lineTo(3.607f, 9.9122f)
                curveTo(3.9821f, 10.3307f, 4.278f, 10.6606f, 4.6579f, 10.8804f)
                curveTo(4.8245f, 10.9768f, 5.0008f, 11.0554f, 5.1838f, 11.115f)
                curveTo(5.6012f, 11.2508f, 6.0444f, 11.2505f, 6.6064f, 11.25f)
                lineTo(11.25f, 11.25f)
                verticalLineTo(11.75f)
                lineTo(6.4616f, 11.75f)
                curveTo(5.7921f, 11.75f, 5.2333f, 11.75f, 4.781f, 11.796f)
                curveTo(4.3075f, 11.8441f, 3.8682f, 11.9489f, 3.4722f, 12.2135f)
                curveTo(3.1719f, 12.4141f, 2.9141f, 12.6719f, 2.7135f, 12.9722f)
                curveTo(2.4489f, 13.3682f, 2.3442f, 13.8075f, 2.296f, 14.281f)
                curveTo(2.25f, 14.7334f, 2.25f, 15.2921f, 2.25f, 15.9617f)
                verticalLineTo(16.0383f)
                curveTo(2.25f, 16.7079f, 2.25f, 17.2666f, 2.296f, 17.719f)
                curveTo(2.3442f, 18.1925f, 2.4489f, 18.6318f, 2.7135f, 19.0278f)
                curveTo(2.9141f, 19.3281f, 3.1719f, 19.5859f, 3.4722f, 19.7865f)
                curveTo(3.8682f, 20.0511f, 4.3075f, 20.1559f, 4.781f, 20.204f)
                curveTo(5.2333f, 20.25f, 5.7921f, 20.25f, 6.4617f, 20.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 21.25f, 9.25f, 21.5858f, 9.25f, 22.0f)
                curveTo(9.25f, 22.4142f, 9.5858f, 22.75f, 10.0f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 22.75f, 14.75f, 22.4142f, 14.75f, 22.0f)
                curveTo(14.75f, 21.5858f, 14.4142f, 21.25f, 14.0f, 21.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.25f)
                lineTo(17.3936f, 20.25f)
                curveTo(17.9556f, 20.2505f, 18.3988f, 20.2508f, 18.8162f, 20.115f)
                curveTo(18.9992f, 20.0554f, 19.1755f, 19.9768f, 19.3421f, 19.8804f)
                curveTo(19.722f, 19.6606f, 20.0179f, 19.3307f, 20.393f, 18.9122f)
                lineTo(20.4822f, 18.8128f)
                curveTo(20.8872f, 18.3619f, 21.2267f, 17.9838f, 21.4738f, 17.6483f)
                curveTo(21.7336f, 17.2958f, 21.9361f, 16.9328f, 22.0161f, 16.5002f)
                curveTo(22.0773f, 16.1695f, 22.0773f, 15.8305f, 22.0161f, 15.4998f)
                curveTo(21.9361f, 15.0672f, 21.7336f, 14.7042f, 21.4738f, 14.3517f)
                curveTo(21.2266f, 14.0162f, 20.8871f, 13.6381f, 20.4822f, 13.1872f)
                lineTo(20.393f, 13.0878f)
                curveTo(20.0179f, 12.6693f, 19.722f, 12.3394f, 19.3421f, 12.1196f)
                curveTo(19.1755f, 12.0232f, 18.9992f, 11.9446f, 18.8162f, 11.885f)
                curveTo(18.3988f, 11.7492f, 17.9556f, 11.7495f, 17.3936f, 11.75f)
                lineTo(12.75f, 11.75f)
                verticalLineTo(11.25f)
                lineTo(17.5383f, 11.25f)
                curveTo(18.2079f, 11.25f, 18.7666f, 11.25f, 19.219f, 11.204f)
                curveTo(19.6924f, 11.1559f, 20.1318f, 11.0511f, 20.5278f, 10.7865f)
                curveTo(20.8281f, 10.5859f, 21.0859f, 10.3281f, 21.2865f, 10.0278f)
                curveTo(21.5511f, 9.6318f, 21.6558f, 9.1924f, 21.704f, 8.719f)
                curveTo(21.75f, 8.2666f, 21.75f, 7.7079f, 21.75f, 7.0383f)
                verticalLineTo(6.9617f)
                curveTo(21.75f, 6.2921f, 21.75f, 5.7334f, 21.704f, 5.281f)
                curveTo(21.6558f, 4.8075f, 21.5511f, 4.3682f, 21.2865f, 3.9722f)
                curveTo(21.0859f, 3.6719f, 20.8281f, 3.4141f, 20.5278f, 3.2135f)
                curveTo(20.1318f, 2.9489f, 19.6924f, 2.8442f, 19.219f, 2.796f)
                curveTo(18.7666f, 2.75f, 18.2079f, 2.75f, 17.5383f, 2.75f)
                lineTo(12.75f, 2.75f)
                verticalLineTo(2.0f)
                close()
                moveTo(6.704f, 4.25f)
                curveTo(5.9977f, 4.25f, 5.8102f, 4.2586f, 5.648f, 4.3114f)
                curveTo(5.5649f, 4.3384f, 5.4847f, 4.3742f, 5.409f, 4.418f)
                curveTo(5.2614f, 4.5034f, 5.1297f, 4.6372f, 4.6578f, 5.1627f)
                curveTo(4.2227f, 5.6473f, 3.9327f, 5.9714f, 3.7338f, 6.2414f)
                curveTo(3.5426f, 6.5009f, 3.4812f, 6.6517f, 3.4588f, 6.7726f)
                curveTo(3.431f, 6.9229f, 3.431f, 7.0771f, 3.4588f, 7.2274f)
                curveTo(3.4812f, 7.3483f, 3.5426f, 7.4991f, 3.7338f, 7.7586f)
                curveTo(3.9327f, 8.0286f, 4.2227f, 8.3527f, 4.6578f, 8.8373f)
                curveTo(5.1297f, 9.3628f, 5.2614f, 9.4966f, 5.409f, 9.582f)
                curveTo(5.4847f, 9.6258f, 5.5649f, 9.6615f, 5.648f, 9.6886f)
                curveTo(5.8102f, 9.7414f, 5.9977f, 9.75f, 6.704f, 9.75f)
                horizontalLineTo(17.5f)
                curveTo(18.2178f, 9.75f, 18.6998f, 9.7491f, 19.0672f, 9.7117f)
                curveTo(19.422f, 9.6756f, 19.586f, 9.6118f, 19.6945f, 9.5393f)
                curveTo(19.8309f, 9.4481f, 19.9481f, 9.3309f, 20.0393f, 9.1945f)
                curveTo(20.1118f, 9.086f, 20.1756f, 8.922f, 20.2117f, 8.5672f)
                curveTo(20.2491f, 8.1998f, 20.25f, 7.7178f, 20.25f, 7.0f)
                curveTo(20.25f, 6.2822f, 20.2491f, 5.8002f, 20.2117f, 5.4328f)
                curveTo(20.1756f, 5.078f, 20.1118f, 4.914f, 20.0393f, 4.8055f)
                curveTo(19.9481f, 4.6691f, 19.8309f, 4.5519f, 19.6945f, 4.4607f)
                curveTo(19.586f, 4.3882f, 19.422f, 4.3244f, 19.0672f, 4.2883f)
                curveTo(18.6998f, 4.2509f, 18.2178f, 4.25f, 17.5f, 4.25f)
                horizontalLineTo(6.704f)
                close()
                moveTo(17.296f, 13.25f)
                curveTo(18.0023f, 13.25f, 18.1898f, 13.2586f, 18.3519f, 13.3114f)
                curveTo(18.4351f, 13.3385f, 18.5153f, 13.3742f, 18.591f, 13.418f)
                curveTo(18.7386f, 13.5034f, 18.8703f, 13.6372f, 19.3421f, 14.1627f)
                curveTo(19.7773f, 14.6473f, 20.0673f, 14.9714f, 20.2662f, 15.2414f)
                curveTo(20.4574f, 15.5009f, 20.5188f, 15.6517f, 20.5411f, 15.7726f)
                curveTo(20.569f, 15.9229f, 20.569f, 16.0771f, 20.5411f, 16.2274f)
                curveTo(20.5188f, 16.3483f, 20.4574f, 16.4991f, 20.2662f, 16.7586f)
                curveTo(20.0673f, 17.0286f, 19.7773f, 17.3527f, 19.3421f, 17.8373f)
                curveTo(18.8703f, 18.3628f, 18.7386f, 18.4966f, 18.591f, 18.582f)
                curveTo(18.5153f, 18.6258f, 18.4351f, 18.6615f, 18.3519f, 18.6886f)
                curveTo(18.1898f, 18.7414f, 18.0023f, 18.75f, 17.296f, 18.75f)
                horizontalLineTo(6.5f)
                curveTo(5.7822f, 18.75f, 5.3002f, 18.7491f, 4.9328f, 18.7117f)
                curveTo(4.578f, 18.6756f, 4.414f, 18.6118f, 4.3055f, 18.5393f)
                curveTo(4.1691f, 18.4481f, 4.0519f, 18.331f, 3.9607f, 18.1945f)
                curveTo(3.8882f, 18.086f, 3.8244f, 17.922f, 3.7883f, 17.5672f)
                curveTo(3.7509f, 17.1998f, 3.75f, 16.7178f, 3.75f, 16.0f)
                curveTo(3.75f, 15.2822f, 3.7509f, 14.8002f, 3.7883f, 14.4328f)
                curveTo(3.8244f, 14.078f, 3.8882f, 13.914f, 3.9607f, 13.8055f)
                curveTo(4.0519f, 13.669f, 4.1691f, 13.5519f, 4.3055f, 13.4607f)
                curveTo(4.414f, 13.3882f, 4.578f, 13.3244f, 4.9328f, 13.2883f)
                curveTo(5.3002f, 13.2509f, 5.7822f, 13.25f, 6.5f, 13.25f)
                horizontalLineTo(17.296f)
                close()
            }
        }
            .build()
        return _signpost2!!
    }

private var _signpost2: ImageVector? = null
