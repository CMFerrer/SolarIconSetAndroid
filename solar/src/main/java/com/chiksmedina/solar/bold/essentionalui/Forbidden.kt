package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

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
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.1511f)
                verticalLineTo(10.8489f)
                curveTo(22.0f, 9.6227f, 22.0f, 9.0095f, 21.7716f, 8.4582f)
                curveTo(21.5433f, 7.9069f, 21.1097f, 7.4734f, 20.2426f, 6.6063f)
                lineTo(19.3485f, 5.7121f)
                lineTo(5.712f, 19.3484f)
                lineTo(6.6063f, 20.2426f)
                curveTo(7.4734f, 21.1097f, 7.9069f, 21.5433f, 8.4582f, 21.7716f)
                curveTo(9.0095f, 22.0f, 9.6227f, 22.0f, 10.8489f, 22.0f)
                horizontalLineTo(13.1511f)
                curveTo(14.3773f, 22.0f, 14.9905f, 22.0f, 15.5418f, 21.7716f)
                curveTo(16.0931f, 21.5433f, 16.5266f, 21.1097f, 17.3937f, 20.2426f)
                lineTo(20.2426f, 17.3937f)
                curveTo(21.1097f, 16.5266f, 21.5433f, 16.0931f, 21.7716f, 15.5418f)
                curveTo(22.0f, 14.9905f, 22.0f, 14.3773f, 22.0f, 13.1511f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.6514f, 18.2877f)
                lineTo(3.7574f, 17.3937f)
                curveTo(2.8903f, 16.5266f, 2.4567f, 16.0931f, 2.2284f, 15.5418f)
                curveTo(2.0f, 14.9905f, 2.0f, 14.3773f, 2.0f, 13.1511f)
                verticalLineTo(10.8489f)
                curveTo(2.0f, 9.6227f, 2.0f, 9.0095f, 2.2284f, 8.4582f)
                curveTo(2.4567f, 7.9069f, 2.8903f, 7.4734f, 3.7574f, 6.6063f)
                lineTo(6.6063f, 3.7574f)
                curveTo(7.4734f, 2.8903f, 7.9069f, 2.4567f, 8.4582f, 2.2284f)
                curveTo(9.0095f, 2.0f, 9.6227f, 2.0f, 10.8489f, 2.0f)
                horizontalLineTo(13.1511f)
                curveTo(14.3773f, 2.0f, 14.9905f, 2.0f, 15.5418f, 2.2284f)
                curveTo(16.0931f, 2.4567f, 16.5266f, 2.8903f, 17.3937f, 3.7574f)
                lineTo(18.2878f, 4.6515f)
                lineTo(4.6514f, 18.2877f)
                close()
            }
        }
            .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null
