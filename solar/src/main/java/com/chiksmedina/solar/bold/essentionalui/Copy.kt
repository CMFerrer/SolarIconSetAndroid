package com.chiksmedina.solar.bold.essentionalui

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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.24f, 2.0f)
                horizontalLineTo(11.3458f)
                curveTo(9.5816f, 2.0f, 8.1842f, 2.0f, 7.0905f, 2.1476f)
                curveTo(5.965f, 2.2995f, 5.054f, 2.6196f, 4.3356f, 3.341f)
                curveTo(3.6172f, 4.0623f, 3.2983f, 4.9769f, 3.147f, 6.107f)
                curveTo(3.0f, 7.205f, 3.0f, 8.608f, 3.0f, 10.3793f)
                verticalLineTo(16.2169f)
                curveTo(3.0f, 17.725f, 3.92f, 19.0174f, 5.2272f, 19.5592f)
                curveTo(5.1599f, 18.6498f, 5.1599f, 17.3737f, 5.16f, 16.312f)
                lineTo(5.16f, 11.3976f)
                lineTo(5.16f, 11.3024f)
                curveTo(5.1599f, 10.0207f, 5.1599f, 8.9164f, 5.2783f, 8.0321f)
                curveTo(5.4052f, 7.0844f, 5.6914f, 6.1759f, 6.4253f, 5.4391f)
                curveTo(7.1592f, 4.7022f, 8.064f, 4.4149f, 9.008f, 4.2874f)
                curveTo(9.8888f, 4.1685f, 10.9887f, 4.1686f, 12.2652f, 4.1687f)
                lineTo(12.36f, 4.1687f)
                horizontalLineTo(15.24f)
                lineTo(15.3348f, 4.1687f)
                curveTo(16.6113f, 4.1686f, 17.7088f, 4.1685f, 18.5896f, 4.2874f)
                curveTo(18.0627f, 2.9478f, 16.7616f, 2.0f, 15.24f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6001f, 11.3974f)
                curveTo(6.6001f, 8.6712f, 6.6001f, 7.3081f, 7.4436f, 6.4612f)
                curveTo(8.2872f, 5.6143f, 9.6448f, 5.6143f, 12.3601f, 5.6143f)
                horizontalLineTo(15.2401f)
                curveTo(17.9554f, 5.6143f, 19.313f, 5.6143f, 20.1566f, 6.4612f)
                curveTo(21.0001f, 7.3081f, 21.0001f, 8.6712f, 21.0001f, 11.3974f)
                verticalLineTo(16.2167f)
                curveTo(21.0001f, 18.9429f, 21.0001f, 20.306f, 20.1566f, 21.1529f)
                curveTo(19.313f, 21.9998f, 17.9554f, 21.9998f, 15.2401f, 21.9998f)
                horizontalLineTo(12.3601f)
                curveTo(9.6448f, 21.9998f, 8.2872f, 21.9998f, 7.4436f, 21.1529f)
                curveTo(6.6001f, 20.306f, 6.6001f, 18.9429f, 6.6001f, 16.2167f)
                verticalLineTo(11.3974f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
