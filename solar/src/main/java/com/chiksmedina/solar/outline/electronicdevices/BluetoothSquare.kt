package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.BluetoothSquare: ImageVector
    get() {
        if (_bluetoothSquare != null) {
            return _bluetoothSquare!!
        }
        _bluetoothSquare = Builder(name = "BluetoothSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(13.0099f, 6.5699f)
                curveTo(13.0232f, 6.5799f, 13.0366f, 6.59f, 13.05f, 6.6f)
                lineTo(14.3833f, 7.6f)
                curveTo(14.3944f, 7.6083f, 14.4055f, 7.6167f, 14.4167f, 7.625f)
                curveTo(14.6318f, 7.7862f, 14.8537f, 7.9525f, 15.0152f, 8.1149f)
                curveTo(15.1982f, 8.299f, 15.4167f, 8.5876f, 15.4167f, 9.0f)
                curveTo(15.4167f, 9.4124f, 15.1982f, 9.701f, 15.0152f, 9.8851f)
                curveTo(14.8537f, 10.0475f, 14.6317f, 10.2138f, 14.4167f, 10.375f)
                curveTo(14.4055f, 10.3834f, 14.3944f, 10.3917f, 14.3833f, 10.4f)
                lineTo(12.25f, 12.0f)
                lineTo(14.3833f, 13.6f)
                curveTo(14.3944f, 13.6083f, 14.4055f, 13.6166f, 14.4167f, 13.625f)
                curveTo(14.6318f, 13.7862f, 14.8537f, 13.9525f, 15.0152f, 14.1149f)
                curveTo(15.1982f, 14.299f, 15.4167f, 14.5876f, 15.4167f, 15.0f)
                curveTo(15.4167f, 15.4124f, 15.1982f, 15.701f, 15.0152f, 15.8851f)
                curveTo(14.8537f, 16.0475f, 14.6317f, 16.2138f, 14.4167f, 16.375f)
                curveTo(14.4055f, 16.3834f, 14.3944f, 16.3917f, 14.3833f, 16.4f)
                lineTo(13.05f, 17.4f)
                curveTo(13.0366f, 17.4101f, 13.0232f, 17.4201f, 13.0099f, 17.4301f)
                curveTo(12.6958f, 17.6658f, 12.3963f, 17.8905f, 12.1382f, 18.0308f)
                curveTo(11.8739f, 18.1744f, 11.4222f, 18.3586f, 10.941f, 18.118f)
                curveTo(10.4598f, 17.8774f, 10.3362f, 17.4055f, 10.2925f, 17.1079f)
                curveTo(10.2498f, 16.8173f, 10.2499f, 16.4428f, 10.25f, 16.0502f)
                curveTo(10.25f, 16.0335f, 10.25f, 16.0168f, 10.25f, 16.0f)
                verticalLineTo(13.6013f)
                lineTo(8.4801f, 15.0762f)
                curveTo(8.1619f, 15.3413f, 7.689f, 15.2983f, 7.4238f, 14.9801f)
                curveTo(7.1587f, 14.6619f, 7.2017f, 14.189f, 7.5199f, 13.9238f)
                lineTo(9.8285f, 12.0f)
                lineTo(7.5199f, 10.0762f)
                curveTo(7.2017f, 9.811f, 7.1587f, 9.3381f, 7.4238f, 9.0199f)
                curveTo(7.689f, 8.7016f, 8.1619f, 8.6587f, 8.4801f, 8.9238f)
                lineTo(10.25f, 10.3987f)
                verticalLineTo(8.0f)
                curveTo(10.25f, 7.9833f, 10.25f, 7.9665f, 10.25f, 7.9498f)
                curveTo(10.2499f, 7.5572f, 10.2498f, 7.1827f, 10.2925f, 6.8921f)
                curveTo(10.3362f, 6.5945f, 10.4598f, 6.1226f, 10.941f, 5.882f)
                curveTo(11.4222f, 5.6414f, 11.8739f, 5.8256f, 12.1382f, 5.9692f)
                curveTo(12.3963f, 6.1095f, 12.6958f, 6.3342f, 13.0099f, 6.5699f)
                close()
                moveTo(11.75f, 13.5f)
                verticalLineTo(16.0f)
                curveTo(11.75f, 16.1995f, 11.7504f, 16.3614f, 11.7528f, 16.4945f)
                curveTo(11.8607f, 16.4165f, 11.9904f, 16.3197f, 12.15f, 16.2f)
                lineTo(13.4833f, 15.2f)
                curveTo(13.5878f, 15.1216f, 13.6737f, 15.0572f, 13.7472f, 15.0f)
                curveTo(13.6737f, 14.9428f, 13.5878f, 14.8784f, 13.4833f, 14.8f)
                lineTo(11.75f, 13.5f)
                close()
                moveTo(11.75f, 10.5f)
                verticalLineTo(8.0f)
                curveTo(11.75f, 7.8005f, 11.7504f, 7.6386f, 11.7528f, 7.5055f)
                curveTo(11.8607f, 7.5835f, 11.9904f, 7.6803f, 12.15f, 7.8f)
                lineTo(13.4833f, 8.8f)
                curveTo(13.5878f, 8.8784f, 13.6737f, 8.9428f, 13.7472f, 9.0f)
                curveTo(13.6737f, 9.0572f, 13.5878f, 9.1216f, 13.4833f, 9.2f)
                lineTo(11.75f, 10.5f)
                close()
            }
        }
        .build()
        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
