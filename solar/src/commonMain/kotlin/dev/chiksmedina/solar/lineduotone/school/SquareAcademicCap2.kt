package dev.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SchoolGroup

val SchoolGroup.SquareAcademicCap2: ImageVector
    get() {
        if (_squareAcademicCap2 != null) {
            return _squareAcademicCap2!!
        }
        _squareAcademicCap2 = Builder(
            name = "SquareAcademicCap2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0916f, 6.6366f)
                lineTo(9.7827f, 3.4997f)
                curveTo(11.2037f, 2.8335f, 12.7961f, 2.8335f, 14.2171f, 3.4997f)
                lineTo(20.9083f, 6.6366f)
                curveTo(22.3638f, 7.319f, 22.3638f, 9.6811f, 20.9083f, 10.3634f)
                lineTo(14.2172f, 13.5003f)
                curveTo(12.7962f, 14.1665f, 11.2038f, 14.1665f, 9.7828f, 13.5003f)
                lineTo(4.9999f, 11.2581f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.5f, 15.0f)
                verticalLineTo(12.1376f)
                curveTo(2.5f, 10.8584f, 2.5f, 10.2188f, 2.8303f, 9.7178f)
                curveTo(3.1606f, 9.2169f, 3.7485f, 8.9649f, 4.9243f, 8.461f)
                lineTo(6.0f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 11.5f)
                verticalLineTo(16.6254f)
                curveTo(19.0f, 17.6334f, 18.4965f, 18.5772f, 17.6147f, 19.0656f)
                curveTo(16.1463f, 19.8787f, 13.796f, 21.0f, 12.0f, 21.0f)
                curveTo(10.204f, 21.0f, 7.8537f, 19.8787f, 6.3853f, 19.0656f)
                curveTo(5.5035f, 18.5772f, 5.0f, 17.6334f, 5.0f, 16.6254f)
                verticalLineTo(11.5f)
            }
        }
            .build()
        return _squareAcademicCap2!!
    }

private var _squareAcademicCap2: ImageVector? = null
