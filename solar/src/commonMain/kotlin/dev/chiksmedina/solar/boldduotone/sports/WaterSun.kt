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

val SportsGroup.WaterSun: ImageVector
    get() {
        if (_waterSun != null) {
            return _waterSun!!
        }
        _waterSun = Builder(
            name = "WaterSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9999f, 1.25f)
                curveTo(12.4141f, 1.25f, 12.7499f, 1.5858f, 12.7499f, 2.0f)
                verticalLineTo(3.0f)
                curveTo(12.7499f, 3.4142f, 12.4141f, 3.75f, 11.9999f, 3.75f)
                curveTo(11.5857f, 3.75f, 11.2499f, 3.4142f, 11.2499f, 3.0f)
                verticalLineTo(2.0f)
                curveTo(11.2499f, 1.5858f, 11.5857f, 1.25f, 11.9999f, 1.25f)
                close()
                moveTo(1.2499f, 12.0f)
                curveTo(1.2499f, 11.5858f, 1.5857f, 11.25f, 1.9999f, 11.25f)
                horizontalLineTo(2.9999f)
                curveTo(3.4141f, 11.25f, 3.7499f, 11.5858f, 3.7499f, 12.0f)
                curveTo(3.7499f, 12.4142f, 3.4141f, 12.75f, 2.9999f, 12.75f)
                horizontalLineTo(1.9999f)
                curveTo(1.5857f, 12.75f, 1.2499f, 12.4142f, 1.2499f, 12.0f)
                close()
                moveTo(20.2499f, 12.0f)
                curveTo(20.2499f, 11.5858f, 20.5857f, 11.25f, 20.9999f, 11.25f)
                horizontalLineTo(21.9999f)
                curveTo(22.4141f, 11.25f, 22.7499f, 11.5858f, 22.7499f, 12.0f)
                curveTo(22.7499f, 12.4142f, 22.4141f, 12.75f, 21.9999f, 12.75f)
                horizontalLineTo(20.9999f)
                curveTo(20.5857f, 12.75f, 20.2499f, 12.4142f, 20.2499f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.1719f, 16.0424f)
                curveTo(20.8486f, 15.7306f, 20.1706f, 14.9891f, 19.5455f, 14.0435f)
                curveTo(19.1368f, 13.425f, 18.4902f, 13.1875f, 17.869f, 13.2526f)
                curveTo(17.9548f, 12.8486f, 17.9999f, 12.4296f, 17.9999f, 12.0f)
                curveTo(17.9999f, 8.6863f, 15.3136f, 6.0f, 11.9999f, 6.0f)
                curveTo(8.6862f, 6.0f, 5.9999f, 8.6863f, 5.9999f, 12.0f)
                curveTo(5.9999f, 12.3623f, 6.032f, 12.7171f, 6.0936f, 13.0617f)
                curveTo(5.5167f, 13.0396f, 4.9334f, 13.2972f, 4.5698f, 13.8657f)
                curveTo(3.9075f, 14.9011f, 3.2289f, 15.7123f, 1.8279f, 16.0424f)
                curveTo(1.4247f, 16.1374f, 1.1749f, 16.5412f, 1.2699f, 16.9444f)
                curveTo(1.3649f, 17.3476f, 1.7688f, 17.5974f, 2.1719f, 17.5024f)
                curveTo(4.139f, 17.0389f, 5.0939f, 15.8301f, 5.8334f, 14.674f)
                curveTo(5.8842f, 14.5946f, 5.9536f, 14.5619f, 6.0296f, 14.5602f)
                curveTo(6.1101f, 14.5585f, 6.2037f, 14.5934f, 6.2754f, 14.6853f)
                curveTo(7.3885f, 16.1101f, 9.1573f, 17.75f, 11.9999f, 17.75f)
                curveTo(14.7602f, 17.75f, 16.5383f, 16.4804f, 17.706f, 14.9195f)
                curveTo(17.7934f, 14.8027f, 17.922f, 14.7449f, 18.0406f, 14.7427f)
                curveTo(18.1516f, 14.7406f, 18.2372f, 14.7844f, 18.2942f, 14.8705f)
                curveTo(19.0203f, 15.9692f, 19.9759f, 17.066f, 21.8279f, 17.5024f)
                curveTo(22.2311f, 17.5974f, 22.6349f, 17.3476f, 22.7299f, 16.9444f)
                curveTo(22.8249f, 16.5412f, 22.5751f, 16.1374f, 22.1719f, 16.0424f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.3994f, 4.3984f)
                curveTo(4.6922f, 4.1055f, 5.1671f, 4.1055f, 5.46f, 4.3984f)
                lineTo(5.8528f, 4.7912f)
                curveTo(6.1458f, 5.0841f, 6.1458f, 5.559f, 5.8528f, 5.8519f)
                curveTo(5.56f, 6.1448f, 5.0851f, 6.1448f, 4.7922f, 5.8519f)
                lineTo(4.3994f, 5.459f)
                curveTo(4.1065f, 5.1662f, 4.1065f, 4.6913f, 4.3994f, 4.3984f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.6009f, 4.3986f)
                curveTo(19.8938f, 4.6915f, 19.8938f, 5.1664f, 19.6009f, 5.4593f)
                lineTo(19.2081f, 5.8521f)
                curveTo(18.9152f, 6.145f, 18.4403f, 6.145f, 18.1474f, 5.8521f)
                curveTo(17.8545f, 5.5592f, 17.8545f, 5.0844f, 18.1474f, 4.7915f)
                lineTo(18.5402f, 4.3986f)
                curveTo(18.8331f, 4.1058f, 19.308f, 4.1058f, 19.6009f, 4.3986f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.57f, 18.8659f)
                curveTo(5.2569f, 17.7921f, 6.7275f, 17.8273f, 7.4577f, 18.762f)
                curveTo(8.4477f, 20.0293f, 9.8296f, 21.2502f, 12.0002f, 21.2502f)
                curveTo(14.2088f, 21.2502f, 15.5699f, 20.2714f, 16.5051f, 19.0211f)
                curveTo(17.2251f, 18.0587f, 18.7909f, 17.9015f, 19.5458f, 19.0437f)
                curveTo(20.1708f, 19.9893f, 20.8488f, 20.7308f, 22.1722f, 21.0426f)
                curveTo(22.5754f, 21.1376f, 22.8252f, 21.5414f, 22.7302f, 21.9446f)
                curveTo(22.6352f, 22.3478f, 22.2313f, 22.5976f, 21.8282f, 22.5026f)
                curveTo(19.9762f, 22.0662f, 19.0206f, 20.9694f, 18.2944f, 19.8707f)
                curveTo(18.2374f, 19.7846f, 18.1519f, 19.7408f, 18.0408f, 19.7429f)
                curveTo(17.9223f, 19.7451f, 17.7936f, 19.8029f, 17.7063f, 19.9197f)
                curveTo(16.5386f, 21.4806f, 14.7604f, 22.7502f, 12.0002f, 22.7502f)
                curveTo(9.1576f, 22.7502f, 7.3888f, 21.1103f, 6.2757f, 19.6855f)
                curveTo(6.2039f, 19.5936f, 6.1103f, 19.5587f, 6.0298f, 19.5604f)
                curveTo(5.9539f, 19.5621f, 5.8844f, 19.5948f, 5.8337f, 19.6742f)
                curveTo(5.0942f, 20.8303f, 4.1393f, 22.0391f, 2.1722f, 22.5026f)
                curveTo(1.769f, 22.5976f, 1.3652f, 22.3478f, 1.2702f, 21.9446f)
                curveTo(1.1752f, 21.5414f, 1.425f, 21.1376f, 1.8282f, 21.0426f)
                curveTo(3.2291f, 20.7125f, 3.9077f, 19.9013f, 4.57f, 18.8659f)
                close()
            }
        }
            .build()
        return _waterSun!!
    }

private var _waterSun: ImageVector? = null
