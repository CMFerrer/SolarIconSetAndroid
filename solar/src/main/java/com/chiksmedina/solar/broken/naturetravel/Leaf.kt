package com.chiksmedina.solar.broken.naturetravel

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
import com.chiksmedina.solar.broken.NatureTravelGroup

public val NatureTravelGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                lineTo(16.0f, 5.0f)
                moveTo(12.0f, 14.5f)
                lineTo(15.0f, 11.5f)
                moveTo(18.5f, 8.0f)
                lineTo(16.875f, 9.625f)
                moveTo(12.0f, 19.5f)
                lineTo(13.875f, 17.625f)
                moveTo(19.5f, 12.0f)
                lineTo(15.75f, 15.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(16.4183f, 22.0f, 20.0f, 18.3541f, 20.0f, 13.8567f)
                curveTo(20.0f, 9.3945f, 17.4467f, 4.1876f, 13.4629f, 2.3256f)
                curveTo(12.9986f, 2.1085f, 12.4993f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 18.3541f, 4.0f, 13.8567f)
                curveTo(4.0f, 12.2707f, 4.3226f, 10.5906f, 4.9173f, 9.0f)
                moveTo(12.0f, 22.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 2.0f)
                curveTo(11.5007f, 2.0f, 11.0014f, 2.1085f, 10.5371f, 2.3256f)
                curveTo(8.9361f, 3.0739f, 7.5661f, 4.3625f, 6.5f, 5.9258f)
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
