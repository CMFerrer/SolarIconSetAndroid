package dev.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.AstronomyGroup

val AstronomyGroup.Ufo3: ImageVector
    get() {
        if (_ufo3 != null) {
            return _ufo3!!
        }
        _ufo3 = Builder(
            name = "Ufo3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.9219f, 12.1491f)
                curveTo(20.5252f, 14.7729f, 20.9934f, 17.1486f, 19.9011f, 18.241f)
                curveTo(18.2711f, 19.8709f, 13.784f, 18.0264f, 9.8788f, 14.1212f)
                curveTo(5.9735f, 10.2159f, 4.129f, 5.7288f, 5.7589f, 4.0989f)
                curveTo(6.8513f, 3.0065f, 9.227f, 3.4748f, 11.8508f, 5.078f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.4847f, 5.4441f)
                curveTo(13.3314f, 3.5974f, 16.3255f, 3.5974f, 18.1722f, 5.4441f)
                lineTo(18.5558f, 5.8277f)
                curveTo(20.4025f, 7.6744f, 20.4025f, 10.6685f, 18.5558f, 12.5152f)
                curveTo(18.4304f, 12.6405f, 18.2697f, 12.7246f, 18.0952f, 12.6933f)
                curveTo(17.5987f, 12.6042f, 16.3769f, 12.1341f, 14.1213f, 9.8785f)
                curveTo(11.8658f, 7.623f, 11.3957f, 6.4011f, 11.3066f, 5.9047f)
                curveTo(11.2752f, 5.7302f, 11.3594f, 5.5694f, 11.4847f, 5.4441f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0002f)
                moveToRelative(-0.7071f, -0.7071f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4142f, 1.4142f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4142f, -1.4142f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.1716f, 7.7575f)
                moveToRelative(-0.7071f, -0.7071f)
                arcToRelative(1.0f, 1.0f, 46.2724f, true, true, 1.4142f, 1.4142f)
                arcToRelative(1.0f, 1.0f, 46.2724f, true, true, -1.4142f, -1.4142f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.2426f, 14.8283f)
                moveToRelative(-0.7071f, -0.7071f)
                arcToRelative(1.0f, 1.0f, 76.2014f, true, true, 1.4142f, 1.4142f)
                arcToRelative(1.0f, 1.0f, 76.2014f, true, true, -1.4142f, -1.4142f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.6361f, 20.364f)
                lineTo(7.7574f, 16.2427f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.9998f, 21.9995f)
                lineTo(12.7071f, 19.7781f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0001f, 14.0f)
                lineTo(4.2218f, 11.293f)
            }
        }
            .build()
        return _ufo3!!
    }

private var _ufo3: ImageVector? = null
