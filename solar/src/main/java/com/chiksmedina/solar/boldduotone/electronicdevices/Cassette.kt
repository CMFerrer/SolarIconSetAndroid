package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Cassette: ImageVector
    get() {
        if (_cassette != null) {
            return _cassette!!
        }
        _cassette = Builder(name = "Cassette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.772f)
                curveTo(9.4312f, 8.0f, 8.7607f, 8.0f, 8.2468f, 7.6438f)
                curveTo(7.7329f, 7.2877f, 7.4975f, 6.66f, 7.0267f, 5.4045f)
                lineTo(6.5f, 4.0f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9733f, 5.4045f)
                lineTo(17.5f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.228f)
                curveTo(14.5688f, 8.0f, 15.2393f, 8.0f, 15.7532f, 7.6438f)
                curveTo(16.2671f, 7.2877f, 16.5025f, 6.66f, 16.9733f, 5.4045f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1716f, 5.1714f)
                curveTo(2.0f, 6.3429f, 2.0f, 8.2286f, 2.0f, 11.9998f)
                curveTo(2.0f, 15.771f, 2.0f, 17.6567f, 3.1716f, 18.8282f)
                curveTo(4.3432f, 19.9998f, 6.2288f, 19.9998f, 10.0f, 19.9998f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 19.9998f, 19.6569f, 19.9998f, 20.8284f, 18.8282f)
                curveTo(22.0f, 17.6567f, 22.0f, 15.771f, 22.0f, 11.9998f)
                curveTo(22.0f, 8.2286f, 22.0f, 6.3429f, 20.8284f, 5.1714f)
                curveTo(20.0914f, 4.4343f, 19.0717f, 4.161f, 17.4776f, 4.0596f)
                lineTo(16.9733f, 5.4043f)
                curveTo(16.5025f, 6.6598f, 16.2671f, 7.2875f, 15.7532f, 7.6437f)
                curveTo(15.2393f, 7.9998f, 14.5688f, 7.9998f, 13.228f, 7.9998f)
                horizontalLineTo(10.772f)
                curveTo(9.4312f, 7.9998f, 8.7607f, 7.9998f, 8.2468f, 7.6437f)
                curveTo(7.7329f, 7.2875f, 7.4975f, 6.6598f, 7.0267f, 5.4043f)
                lineTo(6.5224f, 4.0596f)
                curveTo(4.9283f, 4.161f, 3.9086f, 4.4343f, 3.1716f, 5.1714f)
                close()
                moveTo(8.25f, 11.5f)
                curveTo(7.0074f, 11.5f, 6.0f, 12.5074f, 6.0f, 13.75f)
                curveTo(6.0f, 14.9926f, 7.0074f, 16.0f, 8.25f, 16.0f)
                curveTo(9.4926f, 16.0f, 10.5f, 14.9926f, 10.5f, 13.75f)
                curveTo(10.5f, 12.5074f, 9.4926f, 11.5f, 8.25f, 11.5f)
                close()
                moveTo(15.75f, 11.5f)
                curveTo(14.5074f, 11.5f, 13.5f, 12.5074f, 13.5f, 13.75f)
                curveTo(13.5f, 14.9926f, 14.5074f, 16.0f, 15.75f, 16.0f)
                curveTo(16.9926f, 16.0f, 18.0f, 14.9926f, 18.0f, 13.75f)
                curveTo(18.0f, 12.5074f, 16.9926f, 11.5f, 15.75f, 11.5f)
                close()
            }
        }
        .build()
        return _cassette!!
    }

private var _cassette: ImageVector? = null
