package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(
            name = "Dna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.8476f, 12.1524f)
                lineTo(12.0462f, 12.2208f)
                curveTo(15.3052f, 13.3428f, 19.2301f, 12.2699f, 22.0f, 9.5f)
                moveTo(11.8476f, 12.1524f)
                lineTo(11.2902f, 11.9606f)
                curveTo(8.2485f, 10.9134f, 4.5852f, 11.9147f, 2.0f, 14.5f)
                moveTo(11.8476f, 12.1524f)
                lineTo(11.7792f, 11.9538f)
                curveTo(10.6572f, 8.6948f, 11.7301f, 4.7699f, 14.5f, 2.0f)
                moveTo(11.8476f, 12.1524f)
                lineTo(12.0394f, 12.7098f)
                curveTo(13.0866f, 15.7515f, 12.0853f, 19.4147f, 9.5f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 15.0f)
                lineTo(11.8431f, 16.9217f)
                moveTo(6.7646f, 11.8433f)
                lineTo(8.0f, 13.0786f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.8438f, 6.7646f)
                lineTo(14.0f, 9.0f)
                moveTo(16.0f, 11.0f)
                lineTo(16.9222f, 11.8431f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.9998f, 13.0002f)
                lineTo(7.4998f, 16.5002f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.7783f, 10.8906f)
                lineTo(16.2783f, 7.3906f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.3047f, 18.1914f)
                lineTo(10.8917f, 19.7784f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5869f, 5.5869f)
                lineTo(12.9999f, 3.9999f)
            }
        }
            .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
