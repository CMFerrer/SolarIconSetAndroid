package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Waterdrop: ImageVector
    get() {
        if (_waterdrop != null) {
            return _waterdrop!!
        }
        _waterdrop = Builder(name = "Waterdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6115f, 22.0f)
                curveTo(6.8555f, 22.0f, 3.0f, 18.0569f, 3.0f, 13.1928f)
                verticalLineTo(12.9281f)
                curveTo(3.0f, 8.3165f, 5.7285f, 4.1635f, 9.9033f, 2.4208f)
                curveTo(11.2473f, 1.8597f, 12.7527f, 1.8597f, 14.0967f, 2.4208f)
                curveTo(18.2715f, 4.1635f, 21.0f, 8.3165f, 21.0f, 12.9281f)
                verticalLineTo(13.1928f)
                curveTo(21.0f, 18.0569f, 17.1445f, 22.0f, 12.3885f, 22.0f)
                horizontalLineTo(11.6115f)
                close()
                moveTo(12.0664f, 5.9615f)
                curveTo(12.2402f, 6.3374f, 12.0764f, 6.7831f, 11.7004f, 6.957f)
                curveTo(10.155f, 7.6717f, 8.9071f, 9.1253f, 8.3296f, 10.9499f)
                curveTo(8.2046f, 11.3449f, 7.7832f, 11.5637f, 7.3883f, 11.4387f)
                curveTo(6.9934f, 11.3137f, 6.7745f, 10.8922f, 6.8995f, 10.4973f)
                curveTo(7.5915f, 8.311f, 9.1059f, 6.5042f, 11.0708f, 5.5955f)
                curveTo(11.4468f, 5.4217f, 11.8925f, 5.5855f, 12.0664f, 5.9615f)
                close()
            }
        }
        .build()
        return _waterdrop!!
    }

private var _waterdrop: ImageVector? = null
