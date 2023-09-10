package com.chiksmedina.solar.boldduotone.search

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
import com.chiksmedina.solar.boldduotone.SearchGroup

val SearchGroup.RoundedMagniferZoomOut: ImageVector
    get() {
        if (_roundedMagniferZoomOut != null) {
            return _roundedMagniferZoomOut!!
        }
        _roundedMagniferZoomOut = Builder(
            name = "RoundedMagniferZoomOut", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.8196f, 19.7001f)
                curveTo(17.7303f, 18.6059f, 18.6359f, 17.6924f, 19.7206f, 17.7825f)
                curveTo(19.9087f, 17.7981f, 20.1339f, 17.8666f, 20.3632f, 17.9363f)
                curveTo(20.3853f, 17.943f, 20.4074f, 17.9497f, 20.4295f, 17.9564f)
                curveTo(20.4495f, 17.9624f, 20.4695f, 17.9685f, 20.4895f, 17.9745f)
                curveTo(20.7003f, 18.0378f, 20.9099f, 18.1008f, 21.0693f, 18.1869f)
                curveTo(21.9846f, 18.6813f, 22.28f, 19.8626f, 21.7068f, 20.7358f)
                curveTo(21.6069f, 20.8879f, 21.452f, 21.0436f, 21.2963f, 21.2003f)
                curveTo(21.2815f, 21.2151f, 21.2668f, 21.23f, 21.252f, 21.2449f)
                curveTo(21.2373f, 21.2598f, 21.2225f, 21.2747f, 21.2078f, 21.2896f)
                curveTo(21.0525f, 21.4467f, 20.8981f, 21.6029f, 20.7473f, 21.7036f)
                curveTo(19.8817f, 22.2819f, 18.7106f, 21.9838f, 18.2205f, 21.0606f)
                curveTo(18.1351f, 20.8998f, 18.0727f, 20.6883f, 18.0099f, 20.4758f)
                curveTo(18.0039f, 20.4556f, 17.9979f, 20.4354f, 17.9919f, 20.4152f)
                curveTo(17.9853f, 20.3929f, 17.9786f, 20.3706f, 17.972f, 20.3483f)
                curveTo(17.9029f, 20.117f, 17.835f, 19.8898f, 17.8196f, 19.7001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.1566f, 20.3133f)
                curveTo(16.2137f, 20.3133f, 20.3133f, 16.2137f, 20.3133f, 11.1566f)
                curveTo(20.3133f, 6.0996f, 16.2137f, 2.0f, 11.1566f, 2.0f)
                curveTo(6.0996f, 2.0f, 2.0f, 6.0996f, 2.0f, 11.1566f)
                curveTo(2.0f, 16.2137f, 6.0996f, 20.3133f, 11.1566f, 20.3133f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0234f, 11.1565f)
                curveTo(8.0234f, 10.7572f, 8.3471f, 10.4336f, 8.7463f, 10.4336f)
                horizontalLineTo(13.5656f)
                curveTo(13.9648f, 10.4336f, 14.2885f, 10.7572f, 14.2885f, 11.1565f)
                curveTo(14.2885f, 11.5557f, 13.9648f, 11.8794f, 13.5656f, 11.8794f)
                horizontalLineTo(8.7463f)
                curveTo(8.3471f, 11.8794f, 8.0234f, 11.5557f, 8.0234f, 11.1565f)
                close()
            }
        }
            .build()
        return _roundedMagniferZoomOut!!
    }

private var _roundedMagniferZoomOut: ImageVector? = null
