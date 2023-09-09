package com.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MedicineGroup

public val MedicineGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6f, 6.0f)
                curveTo(2.9285f, 5.2715f, 3.3921f, 4.5891f, 3.9907f, 3.9906f)
                curveTo(6.6448f, 1.3365f, 10.9479f, 1.3365f, 13.602f, 3.9906f)
                lineTo(20.0095f, 10.3981f)
                curveTo(21.0291f, 11.4177f, 21.657f, 12.6807f, 21.8932f, 14.0f)
                moveTo(2.1069f, 10.0f)
                curveTo(2.3432f, 11.3193f, 2.9711f, 12.5823f, 3.9907f, 13.6019f)
                lineTo(10.3982f, 20.0094f)
                curveTo(13.0523f, 22.6635f, 17.3554f, 22.6635f, 20.0095f, 20.0094f)
                curveTo(20.6081f, 19.4109f, 21.0716f, 18.7285f, 21.4002f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8057f, 7.1943f)
                curveTo(16.8057f, 7.1943f, 16.2649f, 10.0f, 13.1322f, 13.1327f)
                curveTo(9.9995f, 16.2653f, 7.1943f, 16.8057f, 7.1943f, 16.8057f)
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
