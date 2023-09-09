package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

public val ElectronicDevicesGroup.BluetoothSquare: ImageVector
    get() {
        if (_bluetoothSquare != null) {
            return _bluetoothSquare!!
        }
        _bluetoothSquare = Builder(name = "BluetoothSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9333f, 9.7999f)
                lineTo(11.0f, 11.9999f)
                verticalLineTo(7.9999f)
                curveTo(11.0f, 7.1272f, 11.0f, 6.6909f, 11.2764f, 6.5527f)
                curveTo(11.5528f, 6.4145f, 11.9019f, 6.6763f, 12.6f, 7.1999f)
                lineTo(13.9333f, 8.1999f)
                curveTo(14.4222f, 8.5666f, 14.6667f, 8.7499f, 14.6667f, 8.9999f)
                curveTo(14.6667f, 9.2499f, 14.4222f, 9.4332f, 13.9333f, 9.7999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9333f, 15.8f)
                lineTo(12.6f, 16.8f)
                curveTo(11.9019f, 17.3236f, 11.5528f, 17.5854f, 11.2764f, 17.4472f)
                curveTo(11.0f, 17.309f, 11.0f, 16.8727f, 11.0f, 16.0f)
                verticalLineTo(12.0f)
                lineTo(13.9333f, 14.2f)
                curveTo(14.4222f, 14.5667f, 14.6667f, 14.75f, 14.6667f, 15.0f)
                curveTo(14.6667f, 15.25f, 14.4222f, 15.4333f, 13.9333f, 15.8f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4801f, 8.9238f)
                curveTo(8.1619f, 8.6587f, 7.689f, 8.7016f, 7.4238f, 9.0199f)
                curveTo(7.1587f, 9.3381f, 7.2017f, 9.811f, 7.5199f, 10.0762f)
                lineTo(8.4801f, 8.9238f)
                close()
                moveTo(11.4801f, 11.4238f)
                lineTo(8.4801f, 8.9238f)
                lineTo(7.5199f, 10.0762f)
                lineTo(10.5199f, 12.5762f)
                lineTo(11.4801f, 11.4238f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4801f, 15.0762f)
                curveTo(8.1619f, 15.3413f, 7.689f, 15.2983f, 7.4238f, 14.9801f)
                curveTo(7.1587f, 14.6619f, 7.2017f, 14.189f, 7.5199f, 13.9238f)
                lineTo(8.4801f, 15.0762f)
                close()
                moveTo(11.4801f, 12.5762f)
                lineTo(8.4801f, 15.0762f)
                lineTo(7.5199f, 13.9238f)
                lineTo(10.5199f, 11.4238f)
                lineTo(11.4801f, 12.5762f)
                close()
            }
        }
        .build()
        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
