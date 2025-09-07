package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 5.5f)
                lineTo(5.5f, 18.4998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.6063f, 3.7574f)
                curveTo(7.4734f, 2.8903f, 7.9069f, 2.4567f, 8.4582f, 2.2284f)
                curveTo(9.0095f, 2.0f, 9.6227f, 2.0f, 10.8489f, 2.0f)
                horizontalLineTo(13.1511f)
                curveTo(14.3773f, 2.0f, 14.9905f, 2.0f, 15.5418f, 2.2284f)
                curveTo(16.0931f, 2.4567f, 16.5266f, 2.8903f, 17.3937f, 3.7574f)
                lineTo(20.2426f, 6.6063f)
                curveTo(21.1097f, 7.4734f, 21.5433f, 7.9069f, 21.7716f, 8.4582f)
                curveTo(22.0f, 9.0095f, 22.0f, 9.6227f, 22.0f, 10.8489f)
                verticalLineTo(13.1511f)
                curveTo(22.0f, 14.3773f, 22.0f, 14.9905f, 21.7716f, 15.5418f)
                curveTo(21.5433f, 16.0931f, 21.1097f, 16.5266f, 20.2426f, 17.3937f)
                lineTo(17.3937f, 20.2426f)
                curveTo(16.5266f, 21.1097f, 16.0931f, 21.5433f, 15.5418f, 21.7716f)
                curveTo(14.9905f, 22.0f, 14.3773f, 22.0f, 13.1511f, 22.0f)
                horizontalLineTo(10.8489f)
                curveTo(9.6227f, 22.0f, 9.0095f, 22.0f, 8.4582f, 21.7716f)
                curveTo(7.9069f, 21.5433f, 7.4734f, 21.1097f, 6.6063f, 20.2426f)
                lineTo(3.7574f, 17.3937f)
                curveTo(2.8903f, 16.5266f, 2.4567f, 16.0931f, 2.2284f, 15.5418f)
                curveTo(2.0f, 14.9905f, 2.0f, 14.3773f, 2.0f, 13.1511f)
                verticalLineTo(10.8489f)
                curveTo(2.0f, 9.6227f, 2.0f, 9.0095f, 2.2284f, 8.4582f)
                curveTo(2.4567f, 7.9069f, 2.8903f, 7.4734f, 3.7574f, 6.6063f)
            }
        }
            .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null
