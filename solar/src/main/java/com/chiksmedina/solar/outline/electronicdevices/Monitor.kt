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

val ElectronicDevicesGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(
            name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 1.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6614f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.1071f, 3.3896f, 22.4392f, 4.3386f, 22.5969f, 5.511f)
                curveTo(22.75f, 6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f)
                verticalLineTo(11.0549f)
                curveTo(22.75f, 11.7174f, 22.75f, 12.3176f, 22.7368f, 12.8591f)
                curveTo(22.7455f, 12.9047f, 22.75f, 12.9518f, 22.75f, 13.0f)
                curveTo(22.75f, 13.0641f, 22.7419f, 13.1264f, 22.7268f, 13.1858f)
                curveTo(22.7103f, 13.6299f, 22.682f, 14.0312f, 22.6335f, 14.3918f)
                curveTo(22.5125f, 15.2919f, 22.2536f, 16.0497f, 21.6517f, 16.6517f)
                curveTo(21.0497f, 17.2536f, 20.2919f, 17.5125f, 19.3918f, 17.6335f)
                curveTo(18.5248f, 17.75f, 17.4225f, 17.75f, 16.0549f, 17.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.25f, 16.75f, 21.5858f, 16.75f, 22.0f)
                curveTo(16.75f, 22.4142f, 16.4142f, 22.75f, 16.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.75f, 7.25f, 22.4142f, 7.25f, 22.0f)
                curveTo(7.25f, 21.5858f, 7.5858f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 17.75f, 5.4752f, 17.75f, 4.6083f, 17.6335f)
                curveTo(3.7081f, 17.5125f, 2.9503f, 17.2536f, 2.3484f, 16.6517f)
                curveTo(1.7464f, 16.0497f, 1.4875f, 15.2919f, 1.3665f, 14.3918f)
                curveTo(1.3181f, 14.0312f, 1.2897f, 13.6299f, 1.2732f, 13.1858f)
                curveTo(1.258f, 13.1264f, 1.25f, 13.0641f, 1.25f, 13.0f)
                curveTo(1.25f, 12.9518f, 1.2545f, 12.9047f, 1.2632f, 12.859f)
                curveTo(1.25f, 12.3176f, 1.25f, 11.7174f, 1.25f, 11.0549f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1058f, 1.25f, 6.6502f, 1.4031f, 5.511f)
                curveTo(1.5608f, 4.3386f, 1.8929f, 3.3896f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
                moveTo(2.8067f, 13.75f)
                curveTo(2.8192f, 13.9063f, 2.8345f, 14.0533f, 2.8531f, 14.1919f)
                curveTo(2.9518f, 14.9257f, 3.1323f, 15.3142f, 3.409f, 15.591f)
                curveTo(3.6858f, 15.8678f, 4.0743f, 16.0482f, 4.8081f, 16.1469f)
                curveTo(5.5635f, 16.2484f, 6.5646f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 16.25f, 18.4365f, 16.2484f, 19.1919f, 16.1469f)
                curveTo(19.9257f, 16.0482f, 20.3142f, 15.8678f, 20.591f, 15.591f)
                curveTo(20.8678f, 15.3142f, 21.0482f, 14.9257f, 21.1469f, 14.1919f)
                curveTo(21.1655f, 14.0533f, 21.1808f, 13.9063f, 21.1933f, 13.75f)
                horizontalLineTo(2.8067f)
                close()
                moveTo(21.2463f, 12.25f)
                horizontalLineTo(2.7537f)
                curveTo(2.7502f, 11.8736f, 2.75f, 11.459f, 2.75f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.75f, 8.0932f, 2.7516f, 6.7385f, 2.8898f, 5.7108f)
                curveTo(3.025f, 4.7048f, 3.2787f, 4.1251f, 3.7019f, 3.7019f)
                curveTo(4.1251f, 3.2787f, 4.7048f, 3.025f, 5.7108f, 2.8898f)
                curveTo(6.7385f, 2.7516f, 8.0932f, 2.75f, 10.0f, 2.75f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 2.75f, 17.2615f, 2.7516f, 18.2892f, 2.8898f)
                curveTo(19.2952f, 3.025f, 19.8749f, 3.2787f, 20.2981f, 3.7019f)
                curveTo(20.7213f, 4.1251f, 20.975f, 4.7048f, 21.1102f, 5.7108f)
                curveTo(21.2484f, 6.7385f, 21.25f, 8.0932f, 21.25f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(21.25f, 11.459f, 21.2498f, 11.8736f, 21.2463f, 12.25f)
                close()
            }
        }
            .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
