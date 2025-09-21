package dev.chiksmedina.solar.bold.electronicdevices

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
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.CloudStorage: ImageVector
    get() {
        if (_cloudStorage != null) {
            return _cloudStorage!!
        }
        _cloudStorage = Builder(
            name = "CloudStorage", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.9393f, 14.4393f)
                curveTo(8.5f, 14.8787f, 8.5f, 15.5858f, 8.5f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(8.5f, 20.4142f, 8.5f, 21.1213f, 8.9393f, 21.5607f)
                curveTo(9.3787f, 22.0f, 10.0858f, 22.0f, 11.5f, 22.0f)
                horizontalLineTo(12.5f)
                curveTo(13.9142f, 22.0f, 14.6213f, 22.0f, 15.0607f, 21.5607f)
                curveTo(15.5f, 21.1213f, 15.5f, 20.4142f, 15.5f, 19.0f)
                verticalLineTo(17.0f)
                curveTo(15.5f, 15.5858f, 15.5f, 14.8787f, 15.0607f, 14.4393f)
                curveTo(14.6213f, 14.0f, 13.9142f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(11.5f)
                curveTo(10.0858f, 14.0f, 9.3787f, 14.0f, 8.9393f, 14.4393f)
                close()
                moveTo(10.25f, 18.0f)
                curveTo(10.25f, 17.5858f, 10.5858f, 17.25f, 11.0f, 17.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 17.25f, 13.75f, 17.5858f, 13.75f, 18.0f)
                curveTo(13.75f, 18.4142f, 13.4142f, 18.75f, 13.0f, 18.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 18.75f, 10.25f, 18.4142f, 10.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 18.0f)
                lineTo(7.0f, 16.9184f)
                curveTo(6.9999f, 16.2823f, 6.9998f, 15.6641f, 7.0683f, 15.1542f)
                curveTo(7.1456f, 14.5794f, 7.3339f, 13.9235f, 7.8787f, 13.3787f)
                curveTo(8.4235f, 12.8339f, 9.0794f, 12.6456f, 9.6542f, 12.5683f)
                curveTo(10.1641f, 12.4998f, 10.7823f, 12.4999f, 11.4184f, 12.5f)
                horizontalLineTo(12.5816f)
                curveTo(13.2177f, 12.4999f, 13.8359f, 12.4998f, 14.3458f, 12.5683f)
                curveTo(14.9206f, 12.6456f, 15.5765f, 12.8339f, 16.1213f, 13.3787f)
                curveTo(16.6662f, 13.9235f, 16.8544f, 14.5794f, 16.9317f, 15.1542f)
                curveTo(17.0003f, 15.6641f, 17.0002f, 16.2823f, 17.0f, 16.9184f)
                lineTo(17.0f, 17.9563f)
                curveTo(19.8188f, 17.6089f, 22.0f, 15.2327f, 22.0f, 12.3529f)
                curveTo(22.0f, 9.8811f, 20.393f, 7.7802f, 18.1551f, 7.015f)
                curveTo(17.8371f, 4.1937f, 15.4159f, 2.0f, 12.4762f, 2.0f)
                curveTo(9.3203f, 2.0f, 6.7619f, 4.5283f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 8.3369f, 6.8871f, 8.9978f, 7.1162f, 9.6089f)
                curveTo(6.8475f, 9.5567f, 6.5698f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(3.9188f, 9.5294f, 2.0f, 11.4256f, 2.0f, 13.7647f)
                curveTo(2.0f, 16.1038f, 3.9188f, 18.0f, 6.2857f, 18.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _cloudStorage!!
    }

private var _cloudStorage: ImageVector? = null
