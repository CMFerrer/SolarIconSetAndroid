package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Forbidden: ImageVector
    get() {
        if (_forbidden != null) {
            return _forbidden!!
        }
        _forbidden = Builder(
            name = "Forbidden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.7063f, 1.25f)
                curveTo(9.6185f, 1.2494f, 8.8626f, 1.2491f, 8.1712f, 1.5354f)
                curveTo(7.4798f, 1.8218f, 6.9455f, 2.3566f, 6.1767f, 3.1262f)
                lineTo(3.1261f, 6.1768f)
                curveTo(2.3566f, 6.9455f, 1.8218f, 7.4798f, 1.5354f, 8.1712f)
                curveTo(1.249f, 8.8626f, 1.2494f, 9.6185f, 1.2499f, 10.7063f)
                verticalLineTo(13.2937f)
                curveTo(1.2494f, 14.3815f, 1.249f, 15.1374f, 1.5354f, 15.8288f)
                curveTo(1.8218f, 16.5202f, 2.3566f, 17.0544f, 3.1261f, 17.8232f)
                lineTo(6.1767f, 20.8738f)
                curveTo(6.9455f, 21.6434f, 7.4798f, 22.1782f, 8.1712f, 22.4645f)
                curveTo(8.8626f, 22.7509f, 9.6185f, 22.7506f, 10.7063f, 22.75f)
                horizontalLineTo(13.2937f)
                curveTo(14.3814f, 22.7506f, 15.1374f, 22.7509f, 15.8288f, 22.4645f)
                curveTo(16.5201f, 22.1782f, 17.0544f, 21.6434f, 17.8232f, 20.8739f)
                lineTo(20.8738f, 17.8232f)
                curveTo(21.6433f, 17.0544f, 22.1781f, 16.5202f, 22.4645f, 15.8288f)
                curveTo(22.7509f, 15.1374f, 22.7505f, 14.3815f, 22.75f, 13.2937f)
                verticalLineTo(10.7063f)
                curveTo(22.7505f, 9.6185f, 22.7509f, 8.8626f, 22.4645f, 8.1712f)
                curveTo(22.1781f, 7.4798f, 21.6433f, 6.9455f, 20.8738f, 6.1768f)
                lineTo(17.8232f, 3.1261f)
                curveTo(17.0544f, 2.3566f, 16.5201f, 1.8218f, 15.8288f, 1.5354f)
                curveTo(15.1374f, 1.2491f, 14.3814f, 1.2494f, 13.2937f, 1.25f)
                horizontalLineTo(10.7063f)
                close()
                moveTo(8.7452f, 2.9213f)
                curveTo(9.1266f, 2.7633f, 9.5614f, 2.75f, 10.8489f, 2.75f)
                horizontalLineTo(13.151f)
                curveTo(14.4385f, 2.75f, 14.8733f, 2.7633f, 15.2547f, 2.9213f)
                curveTo(15.6362f, 3.0793f, 15.953f, 3.3773f, 16.8634f, 4.2877f)
                lineTo(17.7575f, 5.1818f)
                lineTo(5.1817f, 17.7574f)
                lineTo(4.2877f, 16.8634f)
                curveTo(3.3773f, 15.953f, 3.0792f, 15.6362f, 2.9212f, 15.2548f)
                curveTo(2.7632f, 14.8733f, 2.75f, 14.4385f, 2.75f, 13.1511f)
                verticalLineTo(10.8489f)
                curveTo(2.75f, 9.5615f, 2.7632f, 9.1267f, 2.9212f, 8.7452f)
                curveTo(3.0792f, 8.3638f, 3.3773f, 8.047f, 4.2877f, 7.1366f)
                lineTo(7.1366f, 4.2877f)
                curveTo(8.0469f, 3.3773f, 8.3638f, 3.0793f, 8.7452f, 2.9213f)
                close()
                moveTo(6.2423f, 18.8181f)
                lineTo(7.1366f, 19.7123f)
                curveTo(8.0469f, 20.6227f, 8.3638f, 20.9207f, 8.7452f, 21.0787f)
                curveTo(9.1266f, 21.2367f, 9.5614f, 21.25f, 10.8489f, 21.25f)
                horizontalLineTo(13.151f)
                curveTo(14.4385f, 21.25f, 14.8733f, 21.2367f, 15.2547f, 21.0787f)
                curveTo(15.6362f, 20.9207f, 15.953f, 20.6227f, 16.8634f, 19.7123f)
                lineTo(19.7123f, 16.8634f)
                curveTo(20.6226f, 15.953f, 20.9207f, 15.6362f, 21.0787f, 15.2548f)
                curveTo(21.2367f, 14.8733f, 21.25f, 14.4385f, 21.25f, 13.1511f)
                verticalLineTo(10.8489f)
                curveTo(21.25f, 9.5615f, 21.2367f, 9.1267f, 21.0787f, 8.7452f)
                curveTo(20.9207f, 8.3638f, 20.6226f, 8.047f, 19.7123f, 7.1366f)
                lineTo(18.8181f, 6.2425f)
                lineTo(6.2423f, 18.8181f)
                close()
            }
        }
            .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null
