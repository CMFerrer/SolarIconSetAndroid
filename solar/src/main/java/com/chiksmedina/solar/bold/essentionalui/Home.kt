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

public val EssentionalUiGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5192f, 7.8227f)
                curveTo(2.0f, 8.7713f, 2.0f, 9.9155f, 2.0f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(2.0f, 17.6258f, 2.0f, 19.5763f, 3.1716f, 20.7881f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.7881f)
                curveTo(22.0f, 19.5763f, 22.0f, 17.6258f, 22.0f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(22.0f, 9.9155f, 22.0f, 8.7713f, 21.4808f, 7.8227f)
                curveTo(20.9616f, 6.8742f, 20.0131f, 6.2855f, 18.116f, 5.1081f)
                lineTo(16.116f, 3.8669f)
                curveTo(14.1106f, 2.6223f, 13.1079f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8921f, 2.0f, 9.8894f, 2.6223f, 7.884f, 3.8669f)
                lineTo(5.884f, 5.1081f)
                curveTo(3.9869f, 6.2855f, 3.0384f, 6.8742f, 2.5192f, 7.8227f)
                close()
                moveTo(9.0f, 17.25f)
                curveTo(8.5858f, 17.25f, 8.25f, 17.5858f, 8.25f, 18.0f)
                curveTo(8.25f, 18.4142f, 8.5858f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 18.75f, 15.75f, 18.4142f, 15.75f, 18.0f)
                curveTo(15.75f, 17.5858f, 15.4142f, 17.25f, 15.0f, 17.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
