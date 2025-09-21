package dev.chiksmedina.solar.broken.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.SchoolGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.7827f, 3.4997f)
                curveTo(11.2037f, 2.8335f, 12.7962f, 2.8335f, 14.2172f, 3.4997f)
                lineTo(20.9084f, 6.6366f)
                curveTo(22.3639f, 7.319f, 22.3639f, 9.6811f, 20.9084f, 10.3634f)
                lineTo(14.2173f, 13.5003f)
                curveTo(12.7963f, 14.1665f, 11.2038f, 14.1665f, 9.7828f, 13.5003f)
                lineTo(3.0916f, 10.3634f)
                curveTo(1.6361f, 9.681f, 1.6361f, 7.319f, 3.0916f, 6.6366f)
                lineTo(6.0f, 5.2731f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.5f)
                verticalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                curveTo(10.204f, 21.0f, 7.8537f, 19.8787f, 6.3853f, 19.0656f)
                curveTo(5.5035f, 18.5772f, 5.0f, 17.6334f, 5.0f, 16.6254f)
                verticalLineTo(11.5f)
                moveTo(19.0f, 11.5f)
                verticalLineTo(16.6254f)
                curveTo(19.0f, 17.6334f, 18.4965f, 18.5772f, 17.6147f, 19.0656f)
                curveTo(17.0843f, 19.3593f, 16.4388f, 19.6932f, 15.7459f, 20.0f)
            }
        }
            .build()
        return _squareAcademicCap!!
    }

private var _squareAcademicCap: ImageVector? = null
