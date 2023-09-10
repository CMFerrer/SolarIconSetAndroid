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

val EssentionalUiGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(
            name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.5858f, 3.0f, 2.8787f, 3.0f, 2.4393f, 3.4122f)
                curveTo(2.0f, 3.8244f, 2.0f, 4.4878f, 2.0f, 5.8147f)
                verticalLineTo(6.5045f)
                curveTo(2.0f, 7.5423f, 2.0f, 8.0612f, 2.2596f, 8.4914f)
                curveTo(2.5192f, 8.9216f, 2.9935f, 9.1886f, 3.942f, 9.7226f)
                lineTo(6.855f, 11.3624f)
                curveTo(7.4915f, 11.7206f, 7.8097f, 11.8998f, 8.0375f, 12.0976f)
                curveTo(8.512f, 12.5095f, 8.8041f, 12.9935f, 8.9364f, 13.5872f)
                curveTo(9.0f, 13.8722f, 9.0f, 14.2058f, 9.0f, 14.8729f)
                lineTo(9.0f, 17.5424f)
                curveTo(9.0f, 18.452f, 9.0f, 18.9067f, 9.2519f, 19.2613f)
                curveTo(9.5038f, 19.6158f, 9.9513f, 19.7907f, 10.8462f, 20.1406f)
                curveTo(12.7248f, 20.875f, 13.6641f, 21.2422f, 14.3321f, 20.8244f)
                curveTo(15.0f, 20.4066f, 15.0f, 19.4519f, 15.0f, 17.5424f)
                verticalLineTo(14.8729f)
                curveTo(15.0f, 14.2058f, 15.0f, 13.8722f, 15.0636f, 13.5872f)
                curveTo(15.1959f, 12.9935f, 15.488f, 12.5095f, 15.9625f, 12.0976f)
                curveTo(16.1903f, 11.8998f, 16.5085f, 11.7206f, 17.145f, 11.3624f)
                lineTo(20.058f, 9.7226f)
                curveTo(21.0065f, 9.1886f, 21.4808f, 8.9216f, 21.7404f, 8.4914f)
                curveTo(22.0f, 8.0612f, 22.0f, 7.5423f, 22.0f, 6.5045f)
                verticalLineTo(5.8147f)
                curveTo(22.0f, 4.4878f, 22.0f, 3.8244f, 21.5607f, 3.4122f)
                curveTo(21.1213f, 3.0f, 20.4142f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
            .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
