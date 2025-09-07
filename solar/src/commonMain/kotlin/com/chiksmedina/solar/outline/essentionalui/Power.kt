package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(
            name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 6.4142f, 11.5858f, 6.75f, 12.0f, 6.75f)
                curveTo(12.4142f, 6.75f, 12.75f, 6.4142f, 12.75f, 6.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.7919f, 4.3968f)
                curveTo(9.1735f, 4.2356f, 9.3521f, 3.7956f, 9.1909f, 3.414f)
                curveTo(9.0297f, 3.0325f, 8.5897f, 2.8538f, 8.2081f, 3.015f)
                curveTo(4.7083f, 4.4937f, 2.25f, 7.9589f, 2.25f, 12.0f)
                curveTo(2.25f, 17.3848f, 6.6152f, 21.75f, 12.0f, 21.75f)
                curveTo(17.3848f, 21.75f, 21.75f, 17.3848f, 21.75f, 12.0f)
                curveTo(21.75f, 7.9589f, 19.2917f, 4.4937f, 15.7919f, 3.015f)
                curveTo(15.4103f, 2.8538f, 14.9703f, 3.0325f, 14.8091f, 3.414f)
                curveTo(14.6479f, 3.7956f, 14.8265f, 4.2356f, 15.2081f, 4.3968f)
                curveTo(18.1722f, 5.6491f, 20.25f, 8.5828f, 20.25f, 12.0f)
                curveTo(20.25f, 16.5564f, 16.5563f, 20.25f, 12.0f, 20.25f)
                curveTo(7.4436f, 20.25f, 3.75f, 16.5564f, 3.75f, 12.0f)
                curveTo(3.75f, 8.5828f, 5.8278f, 5.6491f, 8.7919f, 4.3968f)
                close()
            }
        }
            .build()
        return _power!!
    }

private var _power: ImageVector? = null
