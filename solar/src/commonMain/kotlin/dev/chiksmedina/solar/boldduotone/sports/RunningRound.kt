package dev.chiksmedina.solar.boldduotone.sports

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
import dev.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.RunningRound: ImageVector
    get() {
        if (_runningRound != null) {
            return _runningRound!!
        }
        _runningRound = Builder(
            name = "RunningRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0001f, 4.5f)
                curveTo(21.0001f, 5.8807f, 19.8808f, 7.0f, 18.5001f, 7.0f)
                curveTo(17.1193f, 7.0f, 16.0001f, 5.8807f, 16.0001f, 4.5f)
                curveTo(16.0001f, 3.1193f, 17.1193f, 2.0f, 18.5001f, 2.0f)
                curveTo(19.8808f, 2.0f, 21.0001f, 3.1193f, 21.0001f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9724f, 5.8101f)
                curveTo(9.8749f, 5.4119f, 10.8988f, 5.3894f, 11.818f, 5.7475f)
                curveTo(14.3857f, 6.7479f, 15.0063f, 10.0988f, 12.9673f, 11.9524f)
                lineTo(11.9273f, 12.898f)
                curveTo(11.8874f, 12.9342f, 11.8757f, 12.9449f, 11.868f, 12.9521f)
                curveTo(11.3146f, 13.4759f, 11.3546f, 14.3687f, 11.9526f, 14.841f)
                curveTo(11.9609f, 14.8475f, 11.9736f, 14.8572f, 12.0164f, 14.8897f)
                lineTo(12.0199f, 14.8923f)
                curveTo(12.0785f, 14.9367f, 12.1125f, 14.9624f, 12.145f, 14.9876f)
                curveTo(14.0178f, 16.4378f, 15.1246f, 18.6648f, 15.1496f, 21.0334f)
                curveTo(15.1501f, 21.0744f, 15.1501f, 21.117f, 15.1501f, 21.1902f)
                verticalLineTo(22.0f)
                curveTo(15.1501f, 22.4142f, 14.8143f, 22.75f, 14.4001f, 22.75f)
                curveTo(13.9858f, 22.75f, 13.6501f, 22.4142f, 13.6501f, 22.0f)
                verticalLineTo(21.195f)
                curveTo(13.6501f, 21.1156f, 13.6501f, 21.0813f, 13.6497f, 21.0492f)
                curveTo(13.6295f, 19.1391f, 12.7369f, 17.3431f, 11.2266f, 16.1736f)
                curveTo(11.2012f, 16.1539f, 11.1739f, 16.1332f, 11.1106f, 16.0853f)
                lineTo(11.1042f, 16.0804f)
                curveTo(11.0708f, 16.0551f, 11.0448f, 16.0354f, 11.0229f, 16.0182f)
                curveTo(9.7074f, 14.9792f, 9.6194f, 13.0151f, 10.8369f, 11.8628f)
                curveTo(10.8572f, 11.8436f, 10.8812f, 11.8217f, 10.9125f, 11.7933f)
                lineTo(11.9583f, 10.8425f)
                curveTo(13.1733f, 9.738f, 12.8035f, 7.7413f, 11.2735f, 7.1452f)
                curveTo(10.7258f, 6.9318f, 10.1156f, 6.9452f, 9.5778f, 7.1825f)
                lineTo(9.0561f, 7.4127f)
                curveTo(8.5109f, 7.6532f, 8.2591f, 7.7645f, 8.0143f, 7.886f)
                curveTo(7.6015f, 8.0909f, 7.2006f, 8.3189f, 6.8135f, 8.569f)
                curveTo(6.5839f, 8.7173f, 6.3595f, 8.8769f, 5.8741f, 9.2226f)
                lineTo(4.4351f, 10.2473f)
                curveTo(4.0977f, 10.4876f, 3.6294f, 10.4088f, 3.3891f, 10.0714f)
                curveTo(3.1489f, 9.734f, 3.2276f, 9.2657f, 3.565f, 9.0254f)
                lineTo(5.021f, 7.9886f)
                curveTo(5.4852f, 7.658f, 5.7381f, 7.4779f, 5.9995f, 7.3091f)
                curveTo(6.434f, 7.0284f, 6.884f, 6.7724f, 7.3474f, 6.5424f)
                curveTo(7.6261f, 6.4041f, 7.9102f, 6.2787f, 8.4316f, 6.0487f)
                lineTo(8.9724f, 5.8101f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.2724f, 11.8183f)
                curveTo(15.3729f, 11.4164f, 15.7801f, 11.1721f, 16.1819f, 11.2726f)
                curveTo(17.3756f, 11.571f, 18.6244f, 11.571f, 19.8181f, 11.2726f)
                curveTo(20.2199f, 11.1721f, 20.6271f, 11.4164f, 20.7276f, 11.8183f)
                curveTo(20.8281f, 12.2201f, 20.5837f, 12.6273f, 20.1819f, 12.7278f)
                curveTo(18.7493f, 13.0859f, 17.2507f, 13.0859f, 15.8181f, 12.7278f)
                curveTo(15.4163f, 12.6273f, 15.1719f, 12.2201f, 15.2724f, 11.8183f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.4801f, 16.424f)
                curveTo(9.7984f, 16.6892f, 9.8413f, 17.1621f, 9.5762f, 17.4803f)
                lineTo(9.3168f, 17.7915f)
                curveTo(7.7546f, 19.6662f, 5.4403f, 20.7502f, 3.0f, 20.7502f)
                curveTo(2.5858f, 20.7502f, 2.25f, 20.4144f, 2.25f, 20.0002f)
                curveTo(2.25f, 19.586f, 2.5858f, 19.2502f, 3.0f, 19.2502f)
                curveTo(4.9952f, 19.2502f, 6.8872f, 18.364f, 8.1645f, 16.8313f)
                lineTo(8.4238f, 16.52f)
                curveTo(8.689f, 16.2018f, 9.1619f, 16.1588f, 9.4801f, 16.424f)
                close()
            }
        }
            .build()
        return _runningRound!!
    }

private var _runningRound: ImageVector? = null
