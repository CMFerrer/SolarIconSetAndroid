package com.chiksmedina.solar.broken.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.BusinessStatisticGroup

val BusinessStatisticGroup.PieChart3: ImageVector
    get() {
        if (_pieChart3 != null) {
            return _pieChart3!!
        }
        _pieChart3 = Builder(
            name = "PieChart3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.4443f, 3.6852f)
                curveTo(6.9711f, 3.3331f, 7.5277f, 3.0337f, 8.1058f, 2.7893f)
                curveTo(9.5087f, 2.1962f, 10.2101f, 1.8996f, 11.1051f, 2.4928f)
                curveTo(12.0f, 3.0861f, 12.0f, 4.0574f, 12.0f, 5.9999f)
                verticalLineTo(7.9999f)
                curveTo(12.0f, 9.8855f, 12.0f, 10.8283f, 12.5858f, 11.4141f)
                curveTo(13.1716f, 11.9999f, 14.1144f, 11.9999f, 16.0f, 11.9999f)
                horizontalLineTo(18.0f)
                curveTo(19.9425f, 11.9999f, 20.9138f, 11.9999f, 21.507f, 12.8948f)
                curveTo(22.1003f, 13.7897f, 21.8037f, 14.4912f, 21.2106f, 15.8941f)
                curveTo(20.9662f, 16.4722f, 20.6667f, 17.0287f, 20.3147f, 17.5556f)
                curveTo(19.2159f, 19.2001f, 17.6541f, 20.4818f, 15.8268f, 21.2387f)
                curveTo(13.9996f, 21.9955f, 11.9889f, 22.1936f, 10.0491f, 21.8077f)
                curveTo(8.1093f, 21.4219f, 6.3275f, 20.4695f, 4.9289f, 19.0709f)
                curveTo(3.5304f, 17.6724f, 2.578f, 15.8906f, 2.1922f, 13.9508f)
                curveTo(1.8063f, 12.011f, 2.0043f, 10.0003f, 2.7612f, 8.173f)
                curveTo(2.9289f, 7.7682f, 3.1223f, 7.3764f, 3.3398f, 6.9998f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 2.3149f)
                curveTo(18.014f, 3.2194f, 20.7805f, 5.9859f, 21.685f, 9.4999f)
            }
        }
            .build()
        return _pieChart3!!
    }

private var _pieChart3: ImageVector? = null
