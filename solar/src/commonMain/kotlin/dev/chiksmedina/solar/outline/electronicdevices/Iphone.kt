package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Iphone: ImageVector
    get() {
        if (_iphone != null) {
            return _iphone!!
        }
        _iphone = Builder(
            name = "Iphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9436f, 1.25f)
                horizontalLineTo(12.0564f)
                curveTo(13.8942f, 1.25f, 15.3498f, 1.25f, 16.489f, 1.4031f)
                curveTo(17.6614f, 1.5608f, 18.6104f, 1.8929f, 19.3588f, 2.6412f)
                curveTo(20.1071f, 3.3896f, 20.4392f, 4.3386f, 20.5969f, 5.511f)
                curveTo(20.75f, 6.6502f, 20.75f, 8.1058f, 20.75f, 9.9436f)
                verticalLineTo(14.0564f)
                curveTo(20.75f, 15.8942f, 20.75f, 17.3498f, 20.5969f, 18.489f)
                curveTo(20.4392f, 19.6614f, 20.1071f, 20.6104f, 19.3588f, 21.3588f)
                curveTo(18.6104f, 22.1071f, 17.6614f, 22.4392f, 16.489f, 22.5969f)
                curveTo(15.3498f, 22.75f, 13.8942f, 22.75f, 12.0564f, 22.75f)
                horizontalLineTo(11.9436f)
                curveTo(10.1058f, 22.75f, 8.6502f, 22.75f, 7.511f, 22.5969f)
                curveTo(6.3386f, 22.4392f, 5.3896f, 22.1071f, 4.6412f, 21.3588f)
                curveTo(3.8929f, 20.6104f, 3.5608f, 19.6614f, 3.4031f, 18.489f)
                curveTo(3.25f, 17.3498f, 3.25f, 15.8942f, 3.25f, 14.0564f)
                verticalLineTo(9.9436f)
                curveTo(3.25f, 8.1058f, 3.25f, 6.6502f, 3.4031f, 5.511f)
                curveTo(3.5608f, 4.3386f, 3.8929f, 3.3896f, 4.6412f, 2.6412f)
                curveTo(5.3896f, 1.8929f, 6.3386f, 1.5608f, 7.511f, 1.4031f)
                curveTo(8.6502f, 1.25f, 10.1058f, 1.25f, 11.9436f, 1.25f)
                close()
                moveTo(6.814f, 3.0732f)
                curveTo(6.325f, 3.2193f, 5.9797f, 3.4241f, 5.7019f, 3.7019f)
                curveTo(5.2787f, 4.1251f, 5.025f, 4.7048f, 4.8898f, 5.7108f)
                curveTo(4.7516f, 6.7385f, 4.75f, 8.0932f, 4.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(4.75f, 15.9068f, 4.7516f, 17.2615f, 4.8898f, 18.2892f)
                curveTo(5.025f, 19.2952f, 5.2787f, 19.8749f, 5.7019f, 20.2981f)
                curveTo(6.1251f, 20.7213f, 6.7048f, 20.975f, 7.7108f, 21.1102f)
                curveTo(8.7385f, 21.2484f, 10.0932f, 21.25f, 12.0f, 21.25f)
                curveTo(13.9068f, 21.25f, 15.2615f, 21.2484f, 16.2892f, 21.1102f)
                curveTo(17.2952f, 20.975f, 17.8749f, 20.7213f, 18.2981f, 20.2981f)
                curveTo(18.7213f, 19.8749f, 18.975f, 19.2952f, 19.1102f, 18.2892f)
                curveTo(19.2484f, 17.2615f, 19.25f, 15.9068f, 19.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(19.25f, 8.0932f, 19.2484f, 6.7385f, 19.1102f, 5.7108f)
                curveTo(18.975f, 4.7048f, 18.7213f, 4.1251f, 18.2981f, 3.7019f)
                curveTo(18.0203f, 3.4241f, 17.6751f, 3.2193f, 17.186f, 3.0732f)
                curveTo(16.5243f, 4.0669f, 16.0616f, 4.7576f, 15.3737f, 5.1851f)
                curveTo(15.2365f, 5.2704f, 15.0938f, 5.3467f, 14.9468f, 5.4136f)
                curveTo(14.2046f, 5.7511f, 13.367f, 5.7507f, 12.1604f, 5.7501f)
                curveTo(12.1077f, 5.75f, 12.0542f, 5.75f, 12.0f, 5.75f)
                curveTo(11.9458f, 5.75f, 11.8923f, 5.75f, 11.8396f, 5.7501f)
                curveTo(10.633f, 5.7507f, 9.7954f, 5.7511f, 9.0533f, 5.4136f)
                curveTo(8.9062f, 5.3467f, 8.7635f, 5.2704f, 8.6263f, 5.1851f)
                curveTo(7.9384f, 4.7576f, 7.4757f, 4.0669f, 6.814f, 3.0732f)
                close()
                moveTo(8.4513f, 2.8161f)
                curveTo(8.8954f, 3.4596f, 9.1279f, 3.7308f, 9.418f, 3.9111f)
                curveTo(9.5003f, 3.9622f, 9.5859f, 4.008f, 9.6742f, 4.0482f)
                curveTo(10.0831f, 4.2341f, 10.5676f, 4.25f, 12.0f, 4.25f)
                curveTo(13.4324f, 4.25f, 13.9169f, 4.2341f, 14.3258f, 4.0482f)
                curveTo(14.4141f, 4.008f, 14.4997f, 3.9622f, 14.582f, 3.9111f)
                curveTo(14.8721f, 3.7308f, 15.1046f, 3.4596f, 15.5487f, 2.8161f)
                curveTo(14.6285f, 2.751f, 13.4807f, 2.75f, 12.0f, 2.75f)
                curveTo(10.5193f, 2.75f, 9.3715f, 2.751f, 8.4513f, 2.8161f)
                close()
                moveTo(8.25f, 19.0f)
                curveTo(8.25f, 18.5858f, 8.5858f, 18.25f, 9.0f, 18.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 18.25f, 15.75f, 18.5858f, 15.75f, 19.0f)
                curveTo(15.75f, 19.4142f, 15.4142f, 19.75f, 15.0f, 19.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 19.75f, 8.25f, 19.4142f, 8.25f, 19.0f)
                close()
            }
        }
            .build()
        return _iphone!!
    }

private var _iphone: ImageVector? = null
