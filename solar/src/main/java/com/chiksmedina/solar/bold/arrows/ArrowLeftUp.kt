package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.ArrowLeftUp: ImageVector
    get() {
        if (_arrowLeftUp != null) {
            return _arrowLeftUp!!
        }
        _arrowLeftUp = Builder(name = "ArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5303f, 17.4697f)
                curveTo(18.8232f, 17.7626f, 18.8232f, 18.2374f, 18.5303f, 18.5303f)
                curveTo(18.2374f, 18.8232f, 17.7626f, 18.8232f, 17.4697f, 18.5303f)
                lineTo(10.5f, 11.5607f)
                lineTo(6.5303f, 15.5303f)
                curveTo(6.3158f, 15.7448f, 5.9932f, 15.809f, 5.713f, 15.6929f)
                curveTo(5.4327f, 15.5768f, 5.25f, 15.3033f, 5.25f, 15.0f)
                verticalLineTo(6.0f)
                curveTo(5.25f, 5.5858f, 5.5858f, 5.25f, 6.0f, 5.25f)
                lineTo(15.0f, 5.25f)
                curveTo(15.3033f, 5.25f, 15.5768f, 5.4327f, 15.6929f, 5.713f)
                curveTo(15.809f, 5.9932f, 15.7448f, 6.3158f, 15.5303f, 6.5303f)
                lineTo(11.5607f, 10.5f)
                lineTo(18.5303f, 17.4697f)
                close()
            }
        }
        .build()
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: ImageVector? = null
