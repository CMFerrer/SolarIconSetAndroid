package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.Pills2: ImageVector
    get() {
        if (_pills2 != null) {
            return _pills2!!
        }
        _pills2 = Builder(name = "Pills2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0261f, 9.9654f)
                curveTo(12.6382f, 9.1358f, 13.0f, 8.1101f, 13.0f, 7.0f)
                curveTo(13.0f, 4.2386f, 10.7614f, 2.0f, 8.0f, 2.0f)
                curveTo(6.8899f, 2.0f, 5.8642f, 2.3618f, 5.0346f, 2.9739f)
                lineTo(12.0261f, 9.9654f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9654f, 11.0261f)
                curveTo(10.1358f, 11.6382f, 9.1101f, 12.0f, 8.0f, 12.0f)
                curveTo(5.2386f, 12.0f, 3.0f, 9.7614f, 3.0f, 7.0f)
                curveTo(3.0f, 5.8899f, 3.3618f, 4.8642f, 3.9739f, 4.0346f)
                lineTo(10.9654f, 11.0261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9438f, 16.25f)
                curveTo(21.79f, 15.2305f, 21.3206f, 14.2495f, 20.5356f, 13.4645f)
                curveTo(18.5829f, 11.5118f, 15.4171f, 11.5118f, 13.4645f, 13.4645f)
                curveTo(12.6795f, 14.2495f, 12.2101f, 15.2305f, 12.0563f, 16.25f)
                horizontalLineTo(21.9438f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9438f, 17.75f)
                horizontalLineTo(12.0563f)
                curveTo(12.2101f, 18.7695f, 12.6795f, 19.7505f, 13.4645f, 20.5355f)
                curveTo(15.4171f, 22.4882f, 18.5829f, 22.4882f, 20.5356f, 20.5355f)
                curveTo(21.3206f, 19.7505f, 21.79f, 18.7695f, 21.9438f, 17.75f)
                close()
            }
        }
        .build()
        return _pills2!!
    }

private var _pills2: ImageVector? = null
