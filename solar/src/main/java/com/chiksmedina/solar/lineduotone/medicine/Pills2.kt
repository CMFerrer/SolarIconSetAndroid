package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

public val MedicineGroup.Pills2: ImageVector
    get() {
        if (_pills2 != null) {
            return _pills2!!
        }
        _pills2 = Builder(name = "Pills2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5355f, 10.5355f)
                curveTo(12.4404f, 9.6307f, 13.0f, 8.3807f, 13.0f, 7.0f)
                curveTo(13.0f, 4.2386f, 10.7614f, 2.0f, 8.0f, 2.0f)
                curveTo(6.6193f, 2.0f, 5.3693f, 2.5596f, 4.4645f, 3.4645f)
                moveTo(11.5355f, 10.5355f)
                curveTo(10.6307f, 11.4404f, 9.3807f, 12.0f, 8.0f, 12.0f)
                curveTo(5.2386f, 12.0f, 3.0f, 9.7614f, 3.0f, 7.0f)
                curveTo(3.0f, 5.6193f, 3.5596f, 4.3693f, 4.4645f, 3.4645f)
                moveTo(11.5355f, 10.5355f)
                lineTo(4.4645f, 3.4645f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                curveTo(22.0f, 15.7204f, 21.5118f, 14.4408f, 20.5355f, 13.4645f)
                curveTo(18.5829f, 11.5118f, 15.4171f, 11.5118f, 13.4645f, 13.4645f)
                curveTo(12.4882f, 14.4408f, 12.0f, 15.7204f, 12.0f, 17.0f)
                moveTo(22.0f, 17.0f)
                curveTo(22.0f, 18.2796f, 21.5118f, 19.5592f, 20.5355f, 20.5355f)
                curveTo(18.5829f, 22.4882f, 15.4171f, 22.4882f, 13.4645f, 20.5355f)
                curveTo(12.4882f, 19.5592f, 12.0f, 18.2796f, 12.0f, 17.0f)
                moveTo(22.0f, 17.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _pills2!!
    }

private var _pills2: ImageVector? = null
