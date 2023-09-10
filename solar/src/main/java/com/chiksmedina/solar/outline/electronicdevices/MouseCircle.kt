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

val ElectronicDevicesGroup.MouseCircle: ImageVector
    get() {
        if (_mouseCircle != null) {
            return _mouseCircle!!
        }
        _mouseCircle = Builder(
            name = "MouseCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.25f, 3.8502f)
                curveTo(11.25f, 3.0909f, 10.6697f, 2.6644f, 10.1622f, 2.7676f)
                curveTo(5.9381f, 3.6263f, 2.75f, 7.3934f, 2.75f, 11.9167f)
                curveTo(2.75f, 17.0772f, 6.8972f, 21.2499f, 12.0f, 21.2499f)
                curveTo(17.1028f, 21.2499f, 21.25f, 17.0772f, 21.25f, 11.9167f)
                curveTo(21.25f, 8.2202f, 19.1208f, 5.0273f, 16.0342f, 3.5154f)
                curveTo(15.6622f, 3.3332f, 15.5084f, 2.8839f, 15.6906f, 2.5119f)
                curveTo(15.8728f, 2.1399f, 16.3221f, 1.9861f, 16.6941f, 2.1683f)
                curveTo(20.2798f, 3.9247f, 22.75f, 7.631f, 22.75f, 11.9167f)
                curveTo(22.75f, 17.8939f, 17.9429f, 22.7499f, 12.0f, 22.7499f)
                curveTo(6.0571f, 22.7499f, 1.25f, 17.8939f, 1.25f, 11.9167f)
                curveTo(1.25f, 6.6746f, 4.9458f, 2.2974f, 9.8633f, 1.2976f)
                curveTo(11.5214f, 0.9606f, 12.75f, 2.3819f, 12.75f, 3.8502f)
                verticalLineTo(5.3088f)
                curveTo(15.017f, 5.6684f, 16.75f, 7.6318f, 16.75f, 9.9999f)
                verticalLineTo(13.9999f)
                curveTo(16.75f, 16.6233f, 14.6234f, 18.7499f, 12.0f, 18.7499f)
                curveTo(9.3766f, 18.7499f, 7.25f, 16.6233f, 7.25f, 13.9999f)
                verticalLineTo(9.9999f)
                curveTo(7.25f, 7.6318f, 8.983f, 5.6684f, 11.25f, 5.3088f)
                verticalLineTo(3.8502f)
                close()
                moveTo(11.25f, 6.8369f)
                curveTo(10.0574f, 7.1186f, 9.1187f, 8.0574f, 8.837f, 9.2499f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.8369f)
                close()
                moveTo(12.75f, 9.2499f)
                horizontalLineTo(15.163f)
                curveTo(14.8813f, 8.0574f, 13.9426f, 7.1186f, 12.75f, 6.8369f)
                verticalLineTo(9.2499f)
                close()
                moveTo(15.25f, 10.7499f)
                horizontalLineTo(8.75f)
                verticalLineTo(13.9999f)
                curveTo(8.75f, 15.7949f, 10.2051f, 17.2499f, 12.0f, 17.2499f)
                curveTo(13.7949f, 17.2499f, 15.25f, 15.7949f, 15.25f, 13.9999f)
                verticalLineTo(10.7499f)
                close()
            }
        }
            .build()
        return _mouseCircle!!
    }

private var _mouseCircle: ImageVector? = null
