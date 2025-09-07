package com.chiksmedina.solar.linear.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MedicineGroup

val MedicineGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(
            name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.9906f, 13.6019f)
                curveTo(1.3365f, 10.9478f, 1.3365f, 6.6447f, 3.9906f, 3.9906f)
                curveTo(6.6447f, 1.3365f, 10.9478f, 1.3365f, 13.6019f, 3.9906f)
                lineTo(20.0094f, 10.3981f)
                curveTo(22.6635f, 13.0522f, 22.6635f, 17.3553f, 20.0094f, 20.0094f)
                curveTo(17.3553f, 22.6635f, 13.0522f, 22.6635f, 10.3981f, 20.0094f)
                lineTo(3.9906f, 13.6019f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.8057f, 7.1943f)
                curveTo(16.8057f, 7.1943f, 16.2649f, 10.0f, 13.1322f, 13.1327f)
                curveTo(9.9995f, 16.2653f, 7.1943f, 16.8057f, 7.1943f, 16.8057f)
            }
        }
            .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
