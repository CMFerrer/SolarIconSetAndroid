package com.chiksmedina.solar.linear.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MedicineGroup

public val MedicineGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8445f, 6.1555f)
                curveTo(17.8445f, 6.1555f, 17.4119f, 8.4f, 14.9057f, 10.9061f)
                curveTo(12.3996f, 13.4123f, 10.1555f, 13.8445f, 10.1555f, 13.8445f)
                moveTo(20.4075f, 16.4075f)
                curveTo(18.2843f, 18.5308f, 14.8418f, 18.5308f, 12.7185f, 16.4075f)
                lineTo(7.5925f, 11.2815f)
                curveTo(5.4692f, 9.1582f, 5.4692f, 5.7157f, 7.5925f, 3.5925f)
                curveTo(9.7157f, 1.4692f, 13.1582f, 1.4692f, 15.2815f, 3.5925f)
                lineTo(20.4075f, 8.7185f)
                curveTo(22.5308f, 10.8418f, 22.5308f, 14.2843f, 20.4075f, 16.4075f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 6.5f)
                lineTo(13.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7302f, 10.1346f)
                curveTo(4.0264f, 10.7172f, 2.0f, 13.122f, 2.0f, 16.0f)
                curveTo(2.0f, 19.3137f, 4.6863f, 22.0f, 8.0f, 22.0f)
                curveTo(10.8911f, 22.0f, 13.3046f, 19.9552f, 13.8732f, 17.233f)
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
