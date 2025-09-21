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

val ElectronicDevicesGroup.MonitorCamera: ImageVector
    get() {
        if (_monitorCamera != null) {
            return _monitorCamera!!
        }
        _monitorCamera = Builder(
            name = "MonitorCamera", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.9506f, 1.25f)
                horizontalLineTo(16.0494f)
                curveTo(16.7142f, 1.25f, 17.2871f, 1.2499f, 17.7458f, 1.3116f)
                curveTo(18.2375f, 1.3777f, 18.7087f, 1.5268f, 19.091f, 1.909f)
                curveTo(19.3266f, 2.1446f, 19.4736f, 2.414f, 19.5672f, 2.7012f)
                lineTo(20.3269f, 2.3846f)
                curveTo(20.3406f, 2.3789f, 20.3543f, 2.3732f, 20.368f, 2.3675f)
                curveTo(20.6449f, 2.252f, 20.9246f, 2.1354f, 21.1637f, 2.0749f)
                curveTo(21.4289f, 2.0077f, 21.8212f, 1.9619f, 22.1934f, 2.2099f)
                curveTo(22.5655f, 2.458f, 22.6741f, 2.8378f, 22.7141f, 3.1085f)
                curveTo(22.7502f, 3.3525f, 22.7501f, 3.6555f, 22.75f, 3.9555f)
                curveTo(22.75f, 3.9704f, 22.75f, 3.9852f, 22.75f, 4.0f)
                verticalLineTo(6.0f)
                curveTo(22.75f, 6.0148f, 22.75f, 6.0296f, 22.75f, 6.0445f)
                curveTo(22.7501f, 6.3446f, 22.7502f, 6.6475f, 22.7141f, 6.8915f)
                curveTo(22.6741f, 7.1622f, 22.5655f, 7.542f, 22.1934f, 7.7901f)
                curveTo(21.8212f, 8.0381f, 21.4289f, 7.9923f, 21.1637f, 7.9251f)
                curveTo(20.9245f, 7.8646f, 20.6449f, 7.748f, 20.368f, 7.6325f)
                curveTo(20.3543f, 7.6268f, 20.3406f, 7.6211f, 20.3269f, 7.6154f)
                lineTo(19.5672f, 7.2988f)
                curveTo(19.4736f, 7.586f, 19.3266f, 7.8554f, 19.091f, 8.091f)
                curveTo(18.7087f, 8.4732f, 18.2375f, 8.6223f, 17.7458f, 8.6884f)
                curveTo(17.2871f, 8.7501f, 16.7142f, 8.75f, 16.0494f, 8.75f)
                horizontalLineTo(14.9506f)
                curveTo(14.2858f, 8.75f, 13.7129f, 8.7501f, 13.2542f, 8.6884f)
                curveTo(12.7625f, 8.6223f, 12.2913f, 8.4732f, 11.909f, 8.091f)
                curveTo(11.5268f, 7.7087f, 11.3777f, 7.2375f, 11.3116f, 6.7459f)
                curveTo(11.2499f, 6.2871f, 11.25f, 5.7142f, 11.25f, 5.0494f)
                verticalLineTo(4.9506f)
                curveTo(11.25f, 4.2858f, 11.2499f, 3.7129f, 11.3116f, 3.2542f)
                curveTo(11.3777f, 2.7625f, 11.5268f, 2.2913f, 11.909f, 1.909f)
                curveTo(12.2913f, 1.5268f, 12.7625f, 1.3777f, 13.2542f, 1.3116f)
                curveTo(13.7129f, 1.2499f, 14.2858f, 1.25f, 14.9506f, 1.25f)
                close()
                moveTo(19.75f, 5.75f)
                lineTo(20.9038f, 6.2308f)
                curveTo(21.0388f, 6.287f, 21.1505f, 6.3335f, 21.248f, 6.372f)
                curveTo(21.25f, 6.2671f, 21.25f, 6.1462f, 21.25f, 6.0f)
                verticalLineTo(4.0f)
                curveTo(21.25f, 3.8538f, 21.25f, 3.7329f, 21.248f, 3.628f)
                curveTo(21.1505f, 3.6665f, 21.0388f, 3.713f, 20.9038f, 3.7692f)
                lineTo(19.75f, 4.25f)
                verticalLineTo(4.8655f)
                curveTo(19.75f, 4.8937f, 19.75f, 4.9221f, 19.75f, 4.9506f)
                verticalLineTo(5.0494f)
                curveTo(19.75f, 5.0779f, 19.75f, 5.1063f, 19.75f, 5.1345f)
                verticalLineTo(5.75f)
                close()
                moveTo(18.25f, 5.0f)
                curveTo(18.25f, 4.2717f, 18.2484f, 3.8009f, 18.2018f, 3.454f)
                curveTo(18.158f, 3.1287f, 18.0874f, 3.0268f, 18.0303f, 2.9697f)
                curveTo(17.9732f, 2.9126f, 17.8713f, 2.842f, 17.546f, 2.7982f)
                curveTo(17.1991f, 2.7516f, 16.7283f, 2.75f, 16.0f, 2.75f)
                horizontalLineTo(15.0f)
                curveTo(14.2717f, 2.75f, 13.8009f, 2.7516f, 13.454f, 2.7982f)
                curveTo(13.1287f, 2.842f, 13.0268f, 2.9126f, 12.9697f, 2.9697f)
                curveTo(12.9126f, 3.0268f, 12.842f, 3.1287f, 12.7982f, 3.454f)
                curveTo(12.7516f, 3.8009f, 12.75f, 4.2717f, 12.75f, 5.0f)
                curveTo(12.75f, 5.7283f, 12.7516f, 6.1991f, 12.7982f, 6.546f)
                curveTo(12.842f, 6.8713f, 12.9126f, 6.9732f, 12.9697f, 7.0303f)
                curveTo(13.0268f, 7.0874f, 13.1287f, 7.158f, 13.454f, 7.2018f)
                curveTo(13.8009f, 7.2484f, 14.2717f, 7.25f, 15.0f, 7.25f)
                horizontalLineTo(16.0f)
                curveTo(16.7283f, 7.25f, 17.1991f, 7.2484f, 17.546f, 7.2018f)
                curveTo(17.8713f, 7.158f, 17.9732f, 7.0874f, 18.0303f, 7.0303f)
                curveTo(18.0874f, 6.9732f, 18.158f, 6.8713f, 18.2018f, 6.546f)
                curveTo(18.2484f, 6.1991f, 18.25f, 5.7283f, 18.25f, 5.0f)
                close()
                moveTo(9.4511f, 1.25f)
                lineTo(9.5f, 1.25f)
                curveTo(9.9142f, 1.25f, 10.25f, 1.5858f, 10.25f, 2.0f)
                curveTo(10.25f, 2.4142f, 9.9142f, 2.75f, 9.5f, 2.75f)
                curveTo(7.8379f, 2.75f, 6.6572f, 2.7512f, 5.7513f, 2.8583f)
                curveTo(4.862f, 2.9634f, 4.3356f, 3.1616f, 3.9382f, 3.4877f)
                curveTo(3.7737f, 3.6228f, 3.6228f, 3.7737f, 3.4877f, 3.9382f)
                curveTo(3.1616f, 4.3356f, 2.9634f, 4.862f, 2.8583f, 5.7513f)
                curveTo(2.7512f, 6.6572f, 2.75f, 7.8379f, 2.75f, 9.5f)
                verticalLineTo(11.0f)
                curveTo(2.75f, 11.459f, 2.7502f, 11.8736f, 2.7537f, 12.25f)
                horizontalLineTo(21.2463f)
                curveTo(21.2498f, 11.8736f, 21.25f, 11.459f, 21.25f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(21.25f, 9.5858f, 21.5858f, 9.25f, 22.0f, 9.25f)
                curveTo(22.4142f, 9.25f, 22.75f, 9.5858f, 22.75f, 10.0f)
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
                lineTo(1.25f, 9.4511f)
                curveTo(1.25f, 7.8488f, 1.25f, 6.5795f, 1.3687f, 5.5753f)
                curveTo(1.4906f, 4.5443f, 1.7464f, 3.6956f, 2.3282f, 2.9866f)
                curveTo(2.5256f, 2.7461f, 2.7461f, 2.5256f, 2.9866f, 2.3282f)
                curveTo(3.6956f, 1.7464f, 4.5443f, 1.4906f, 5.5753f, 1.3687f)
                curveTo(6.5795f, 1.25f, 7.8488f, 1.25f, 9.4511f, 1.25f)
                close()
                moveTo(2.8067f, 13.75f)
                curveTo(2.8192f, 13.9064f, 2.8345f, 14.0533f, 2.8531f, 14.1919f)
                curveTo(2.9518f, 14.9257f, 3.1323f, 15.3142f, 3.409f, 15.591f)
                curveTo(3.6858f, 15.8678f, 4.0743f, 16.0482f, 4.8081f, 16.1469f)
                curveTo(5.5635f, 16.2484f, 6.5646f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(17.4354f, 16.25f, 18.4365f, 16.2484f, 19.1919f, 16.1469f)
                curveTo(19.9257f, 16.0482f, 20.3142f, 15.8678f, 20.591f, 15.591f)
                curveTo(20.8678f, 15.3142f, 21.0482f, 14.9257f, 21.1469f, 14.1919f)
                curveTo(21.1655f, 14.0533f, 21.1808f, 13.9064f, 21.1933f, 13.75f)
                horizontalLineTo(2.8067f)
                close()
            }
        }
            .build()
        return _monitorCamera!!
    }

private var _monitorCamera: ImageVector? = null
