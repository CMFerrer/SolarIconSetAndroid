package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.PointOnMap: ImageVector
    get() {
        if (_pointOnMap != null) {
            return _pointOnMap!!
        }
        _pointOnMap = Builder(
            name = "PointOnMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 13.0368f)
                curveTo(3.0f, 11.9338f, 3.0f, 11.3823f, 3.3926f, 11.0607f)
                curveTo(3.532f, 10.9465f, 3.7015f, 10.8551f, 3.8903f, 10.7922f)
                curveTo(4.4221f, 10.6151f, 5.1211f, 10.7895f, 6.519f, 11.1383f)
                curveTo(7.5863f, 11.4046f, 8.1199f, 11.5377f, 8.6591f, 11.5239f)
                curveTo(8.8571f, 11.5189f, 9.054f, 11.4991f, 9.2469f, 11.465f)
                curveTo(9.7719f, 11.3721f, 10.2399f, 11.1386f, 11.176f, 10.6715f)
                lineTo(12.5583f, 9.9816f)
                curveTo(13.7574f, 9.3833f, 14.3569f, 9.0841f, 15.0451f, 9.0151f)
                curveTo(15.7333f, 8.9461f, 16.4168f, 9.1167f, 17.7839f, 9.4578f)
                lineTo(18.9487f, 9.7484f)
                curveTo(19.9387f, 9.9954f, 20.4337f, 10.119f, 20.7169f, 10.413f)
                curveTo(21.0f, 10.707f, 21.0f, 11.0976f, 21.0f, 11.8788f)
                verticalLineTo(17.9632f)
                curveTo(21.0f, 19.0662f, 21.0f, 19.6177f, 20.6074f, 19.9393f)
                curveTo(20.468f, 20.0535f, 20.2985f, 20.1449f, 20.1097f, 20.2078f)
                curveTo(19.5779f, 20.3849f, 18.8789f, 20.2105f, 17.481f, 19.8617f)
                curveTo(16.4137f, 19.5954f, 15.8801f, 19.4623f, 15.3409f, 19.4761f)
                curveTo(15.1429f, 19.4811f, 14.946f, 19.5009f, 14.7532f, 19.535f)
                curveTo(14.2281f, 19.6279f, 13.7601f, 19.8614f, 12.824f, 20.3285f)
                lineTo(11.4417f, 21.0184f)
                curveTo(10.2426f, 21.6167f, 9.6431f, 21.9159f, 8.9549f, 21.9849f)
                curveTo(8.2667f, 22.0539f, 7.5832f, 21.8833f, 6.2161f, 21.5422f)
                lineTo(5.0513f, 21.2516f)
                curveTo(4.0613f, 21.0046f, 3.5663f, 20.881f, 3.2831f, 20.587f)
                curveTo(3.0f, 20.293f, 3.0f, 19.9024f, 3.0f, 19.1212f)
                verticalLineTo(13.0368f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(8.6863f, 2.0f, 6.0f, 4.5521f, 6.0f, 7.7003f)
                curveTo(6.0f, 10.8238f, 7.915f, 14.4687f, 10.9028f, 15.7721f)
                curveTo(11.5993f, 16.076f, 12.4007f, 16.076f, 13.0972f, 15.7721f)
                curveTo(16.085f, 14.4687f, 18.0f, 10.8238f, 18.0f, 7.7003f)
                curveTo(18.0f, 4.5521f, 15.3137f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
            .build()
        return _pointOnMap!!
    }

private var _pointOnMap: ImageVector? = null
