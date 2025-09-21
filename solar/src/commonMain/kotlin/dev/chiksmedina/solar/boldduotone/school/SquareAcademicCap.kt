package dev.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.SquareAcademicCap: ImageVector
    get() {
        if (_squareAcademicCap != null) {
            return _squareAcademicCap!!
        }
        _squareAcademicCap = Builder(
            name = "SquareAcademicCap", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.2172f, 3.4997f)
                curveTo(12.7962f, 2.8335f, 11.2037f, 2.8335f, 9.7827f, 3.4997f)
                lineTo(3.0916f, 6.6366f)
                curveTo(2.0156f, 7.141f, 1.7351f, 8.5635f, 2.25f, 9.5467f)
                lineTo(2.25f, 14.5f)
                curveTo(2.25f, 14.9142f, 2.5858f, 15.25f, 3.0f, 15.25f)
                curveTo(3.4142f, 15.25f, 3.75f, 14.9142f, 3.75f, 14.5f)
                verticalLineTo(10.672f)
                lineTo(9.7828f, 13.5003f)
                curveTo(11.2038f, 14.1665f, 12.7963f, 14.1665f, 14.2173f, 13.5003f)
                lineTo(20.9084f, 10.3634f)
                curveTo(22.3639f, 9.6811f, 22.3639f, 7.319f, 20.9084f, 6.6366f)
                lineTo(14.2172f, 3.4997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 11.2583f)
                lineTo(9.7828f, 13.5006f)
                curveTo(11.2038f, 14.1668f, 12.7963f, 14.1668f, 14.2173f, 13.5006f)
                lineTo(19.0f, 11.2583f)
                verticalLineTo(16.6255f)
                curveTo(19.0f, 17.6335f, 18.4965f, 18.5773f, 17.6147f, 19.0656f)
                curveTo(16.1463f, 19.8788f, 13.796f, 21.0001f, 12.0f, 21.0001f)
                curveTo(10.204f, 21.0001f, 7.8537f, 19.8788f, 6.3853f, 19.0656f)
                curveTo(5.5035f, 18.5773f, 5.0f, 17.6335f, 5.0f, 16.6255f)
                verticalLineTo(11.2583f)
                close()
            }
        }
            .build()
        return _squareAcademicCap!!
    }

private var _squareAcademicCap: ImageVector? = null
