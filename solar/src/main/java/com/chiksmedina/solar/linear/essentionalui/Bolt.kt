package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6695f, 9.9144f)
                lineTo(8.7317f, 5.7713f)
                curveTo(10.711f, 3.0933f, 11.7007f, 1.7543f, 12.6241f, 2.0372f)
                curveTo(13.5474f, 2.3202f, 13.5474f, 3.9625f, 13.5474f, 7.2471f)
                verticalLineTo(7.5568f)
                curveTo(13.5474f, 8.7415f, 13.5474f, 9.3339f, 13.926f, 9.7054f)
                lineTo(13.946f, 9.7247f)
                curveTo(14.3327f, 10.0884f, 14.9492f, 10.0884f, 16.1822f, 10.0884f)
                curveTo(18.4011f, 10.0884f, 19.5106f, 10.0884f, 19.8855f, 10.7613f)
                curveTo(19.8917f, 10.7724f, 19.8977f, 10.7837f, 19.9036f, 10.795f)
                curveTo(20.2576f, 11.4784f, 19.6152f, 12.3475f, 18.3304f, 14.0857f)
                lineTo(15.2683f, 18.2287f)
                curveTo(13.2889f, 20.9067f, 12.2992f, 22.2458f, 11.3758f, 21.9628f)
                curveTo(10.4525f, 21.6798f, 10.4525f, 20.0375f, 10.4525f, 16.7528f)
                lineTo(10.4526f, 16.4433f)
                curveTo(10.4526f, 15.2585f, 10.4526f, 14.6662f, 10.074f, 14.2946f)
                lineTo(10.054f, 14.2754f)
                curveTo(9.6673f, 13.9117f, 9.0508f, 13.9117f, 7.8177f, 13.9117f)
                curveTo(5.5989f, 13.9117f, 4.4894f, 13.9117f, 4.1145f, 13.2387f)
                curveTo(4.1083f, 13.2276f, 4.1023f, 13.2164f, 4.0964f, 13.205f)
                curveTo(3.7424f, 12.5217f, 4.3848f, 11.6526f, 5.6695f, 9.9144f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
