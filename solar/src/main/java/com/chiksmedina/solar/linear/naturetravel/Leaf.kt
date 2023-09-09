package com.chiksmedina.solar.linear.naturetravel

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
import com.chiksmedina.solar.linear.NatureTravelGroup

public val NatureTravelGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9999f, 9.0f)
                lineTo(16.4999f, 4.5f)
                moveTo(11.9999f, 14.5f)
                lineTo(18.4999f, 8.0f)
                moveTo(11.9999f, 19.5f)
                lineTo(19.4999f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(16.4183f, 22.0f, 20.0f, 18.3541f, 20.0f, 13.8567f)
                curveTo(20.0f, 9.3945f, 17.4467f, 4.1876f, 13.4629f, 2.3256f)
                curveTo(12.9986f, 2.1085f, 12.4993f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 18.3541f, 4.0f, 13.8567f)
                curveTo(4.0f, 9.3945f, 6.5533f, 4.1876f, 10.5371f, 2.3256f)
                curveTo(11.0014f, 2.1085f, 11.5007f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 22.0f)
                verticalLineTo(2.0f)
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
