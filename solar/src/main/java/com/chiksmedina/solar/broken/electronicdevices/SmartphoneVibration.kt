package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

public val ElectronicDevicesGroup.SmartphoneVibration: ImageVector
    get() {
        if (_smartphoneVibration != null) {
            return _smartphoneVibration!!
        }
        _smartphoneVibration = Builder(name = "SmartphoneVibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 5.1716f, 19.0f, 3.7574f, 18.1213f, 2.8787f)
                curveTo(17.2426f, 2.0f, 15.8284f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(8.1716f, 2.0f, 6.7574f, 2.0f, 5.8787f, 2.8787f)
                curveTo(5.0f, 3.7574f, 5.0f, 5.1716f, 5.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 18.8284f, 5.0f, 20.2426f, 5.8787f, 21.1213f)
                curveTo(6.7574f, 22.0f, 8.1716f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 22.0f, 17.2426f, 22.0f, 18.1213f, 21.1213f)
                curveTo(19.0f, 20.2426f, 19.0f, 18.8284f, 19.0f, 16.0f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 19.0f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9999f, 6.0f)
                lineTo(21.2235f, 7.5528f)
                curveTo(21.0827f, 7.8343f, 21.0827f, 8.1657f, 21.2235f, 8.4472f)
                lineTo(21.7763f, 9.5528f)
                curveTo(21.917f, 9.8343f, 21.917f, 10.1657f, 21.7763f, 10.4472f)
                lineTo(21.2235f, 11.5528f)
                curveTo(21.0827f, 11.8343f, 21.0827f, 12.1657f, 21.2235f, 12.4472f)
                lineTo(21.7763f, 13.5528f)
                curveTo(21.917f, 13.8343f, 21.917f, 14.1657f, 21.7763f, 14.4472f)
                lineTo(21.2235f, 15.5528f)
                curveTo(21.0827f, 15.8343f, 21.0827f, 16.1657f, 21.2235f, 16.4472f)
                lineTo(21.9999f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(2.7764f, 7.5528f)
                curveTo(2.9172f, 7.8343f, 2.9172f, 8.1657f, 2.7764f, 8.4472f)
                lineTo(2.2236f, 9.5528f)
                curveTo(2.0828f, 9.8343f, 2.0828f, 10.1657f, 2.2236f, 10.4472f)
                lineTo(2.7764f, 11.5528f)
                curveTo(2.9172f, 11.8343f, 2.9172f, 12.1657f, 2.7764f, 12.4472f)
                lineTo(2.2236f, 13.5528f)
                curveTo(2.0828f, 13.8343f, 2.0828f, 14.1657f, 2.2236f, 14.4472f)
                lineTo(2.7764f, 15.5528f)
                curveTo(2.9172f, 15.8343f, 2.9172f, 16.1657f, 2.7764f, 16.4472f)
                lineTo(2.0f, 18.0f)
            }
        }
        .build()
        return _smartphoneVibration!!
    }

private var _smartphoneVibration: ImageVector? = null
