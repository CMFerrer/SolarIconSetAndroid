package dev.chiksmedina.solar.outline.medicine

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
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.JarOfPills: ImageVector
    get() {
        if (_jarOfPills != null) {
            return _jarOfPills!!
        }
        _jarOfPills = Builder(
            name = "JarOfPills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 12.0f)
                curveTo(12.75f, 11.5858f, 12.4142f, 11.25f, 12.0f, 11.25f)
                curveTo(11.5858f, 11.25f, 11.25f, 11.5858f, 11.25f, 12.0f)
                verticalLineTo(13.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 13.25f, 9.25f, 13.5858f, 9.25f, 14.0f)
                curveTo(9.25f, 14.4142f, 9.5858f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 14.75f, 14.75f, 14.4142f, 14.75f, 14.0f)
                curveTo(14.75f, 13.5858f, 14.4142f, 13.25f, 14.0f, 13.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.4782f, 1.25f)
                horizontalLineTo(16.5218f)
                curveTo(16.736f, 1.25f, 16.9329f, 1.25f, 17.0982f, 1.2613f)
                curveTo(17.2759f, 1.2734f, 17.4712f, 1.301f, 17.6697f, 1.3832f)
                curveTo(18.0985f, 1.5608f, 18.4392f, 1.9015f, 18.6168f, 2.3303f)
                curveTo(18.699f, 2.5288f, 18.7266f, 2.7241f, 18.7387f, 2.9018f)
                curveTo(18.75f, 3.0671f, 18.75f, 3.264f, 18.75f, 3.4782f)
                verticalLineTo(3.5218f)
                curveTo(18.75f, 3.736f, 18.75f, 3.9329f, 18.7387f, 4.0982f)
                curveTo(18.7266f, 4.2758f, 18.699f, 4.4712f, 18.6168f, 4.6697f)
                curveTo(18.4392f, 5.0985f, 18.0985f, 5.4392f, 17.6697f, 5.6168f)
                curveTo(17.4931f, 5.6899f, 17.319f, 5.7199f, 17.1577f, 5.7341f)
                lineTo(18.9887f, 7.2164f)
                curveTo(20.1028f, 8.1182f, 20.75f, 9.4749f, 20.75f, 10.9083f)
                verticalLineTo(17.5649f)
                curveTo(20.75f, 18.6667f, 20.367f, 19.7341f, 19.6667f, 20.5845f)
                lineTo(19.3084f, 21.0196f)
                curveTo(18.4061f, 22.1153f, 17.0611f, 22.75f, 15.6417f, 22.75f)
                lineTo(8.902f, 22.75f)
                curveTo(8.3833f, 22.7501f, 8.0497f, 22.7501f, 7.7276f, 22.7059f)
                curveTo(6.7741f, 22.575f, 5.8828f, 22.1576f, 5.1719f, 21.5088f)
                curveTo(4.9317f, 21.2897f, 4.7181f, 21.0334f, 4.3861f, 20.6349f)
                lineTo(4.3509f, 20.5927f)
                curveTo(3.6396f, 19.739f, 3.25f, 18.663f, 3.25f, 17.5518f)
                verticalLineTo(10.9225f)
                curveTo(3.25f, 9.4795f, 3.9059f, 8.1148f, 5.0327f, 7.2134f)
                lineTo(6.8781f, 5.7371f)
                curveTo(6.7069f, 5.7241f, 6.52f, 5.6954f, 6.3303f, 5.6168f)
                curveTo(5.9015f, 5.4392f, 5.5608f, 5.0985f, 5.3832f, 4.6697f)
                curveTo(5.301f, 4.4712f, 5.2734f, 4.2759f, 5.2613f, 4.0982f)
                curveTo(5.25f, 3.9329f, 5.25f, 3.736f, 5.25f, 3.5218f)
                verticalLineTo(3.4783f)
                curveTo(5.25f, 3.264f, 5.25f, 3.0671f, 5.2613f, 2.9018f)
                curveTo(5.2734f, 2.7241f, 5.301f, 2.5288f, 5.3832f, 2.3303f)
                curveTo(5.5608f, 1.9015f, 5.9015f, 1.5608f, 6.3303f, 1.3832f)
                curveTo(6.5288f, 1.301f, 6.7242f, 1.2734f, 6.9018f, 1.2613f)
                curveTo(7.0671f, 1.25f, 7.264f, 1.25f, 7.4782f, 1.25f)
                close()
                moveTo(10.4031f, 5.75f)
                horizontalLineTo(13.6427f)
                curveTo(14.3954f, 5.75f, 14.5936f, 5.7599f, 14.7679f, 5.8217f)
                curveTo(14.9423f, 5.8834f, 15.1025f, 6.0003f, 15.6876f, 6.474f)
                lineTo(18.0449f, 8.3822f)
                curveTo(18.3481f, 8.6277f, 18.6007f, 8.9224f, 18.7951f, 9.25f)
                horizontalLineTo(5.2134f)
                curveTo(5.4097f, 8.9228f, 5.6645f, 8.6289f, 5.9697f, 8.3847f)
                lineTo(8.3729f, 6.4622f)
                curveTo(8.9553f, 5.9962f, 9.1148f, 5.8812f, 9.2878f, 5.8205f)
                curveTo(9.4608f, 5.7598f, 9.6572f, 5.75f, 10.4031f, 5.75f)
                close()
                moveTo(4.7546f, 10.75f)
                horizontalLineTo(19.2462f)
                curveTo(19.2487f, 10.8026f, 19.25f, 10.8554f, 19.25f, 10.9083f)
                verticalLineTo(17.25f)
                horizontalLineTo(4.75f)
                verticalLineTo(10.9225f)
                curveTo(4.75f, 10.8648f, 4.7515f, 10.8073f, 4.7546f, 10.75f)
                close()
                moveTo(4.9789f, 18.75f)
                horizontalLineTo(19.0262f)
                curveTo(18.9022f, 19.0668f, 18.7283f, 19.3645f, 18.5088f, 19.631f)
                lineTo(18.1505f, 20.066f)
                curveTo(17.5331f, 20.8157f, 16.6129f, 21.25f, 15.6417f, 21.25f)
                horizontalLineTo(8.9569f)
                curveTo(8.3651f, 21.25f, 8.1396f, 21.2484f, 7.9316f, 21.2198f)
                curveTo(7.2792f, 21.1303f, 6.6694f, 20.8446f, 6.1829f, 20.4008f)
                curveTo(6.0278f, 20.2592f, 5.8822f, 20.0871f, 5.5033f, 19.6324f)
                curveTo(5.2812f, 19.3659f, 5.1049f, 19.0677f, 4.9789f, 18.75f)
                close()
                moveTo(16.5f, 4.25f)
                horizontalLineTo(13.9418f)
                curveTo(13.878f, 4.2498f, 13.8127f, 4.2499f, 13.7459f, 4.2499f)
                lineTo(10.3009f, 4.2499f)
                curveTo(10.2347f, 4.2499f, 10.17f, 4.2498f, 10.1068f, 4.25f)
                horizontalLineTo(7.5f)
                curveTo(7.2568f, 4.25f, 7.1119f, 4.2496f, 7.0039f, 4.2422f)
                curveTo(6.9371f, 4.2377f, 6.9087f, 4.2316f, 6.9013f, 4.2297f)
                curveTo(6.8425f, 4.2044f, 6.7956f, 4.1575f, 6.7703f, 4.0987f)
                curveTo(6.7684f, 4.0913f, 6.7623f, 4.0629f, 6.7578f, 3.9961f)
                curveTo(6.7504f, 3.8881f, 6.75f, 3.7432f, 6.75f, 3.5f)
                curveTo(6.75f, 3.2568f, 6.7504f, 3.1119f, 6.7578f, 3.0039f)
                curveTo(6.7623f, 2.9371f, 6.7684f, 2.9087f, 6.7703f, 2.9013f)
                curveTo(6.7956f, 2.8425f, 6.8425f, 2.7956f, 6.9013f, 2.7703f)
                curveTo(6.9087f, 2.7684f, 6.9371f, 2.7623f, 7.0039f, 2.7578f)
                curveTo(7.1119f, 2.7504f, 7.2568f, 2.75f, 7.5f, 2.75f)
                horizontalLineTo(16.5f)
                curveTo(16.7432f, 2.75f, 16.8881f, 2.7504f, 16.9961f, 2.7578f)
                curveTo(17.0629f, 2.7623f, 17.0913f, 2.7684f, 17.0987f, 2.7703f)
                curveTo(17.1575f, 2.7956f, 17.2044f, 2.8425f, 17.2297f, 2.9013f)
                curveTo(17.2316f, 2.9087f, 17.2377f, 2.9371f, 17.2422f, 3.0039f)
                curveTo(17.2496f, 3.1119f, 17.25f, 3.2568f, 17.25f, 3.5f)
                curveTo(17.25f, 3.7432f, 17.2496f, 3.8881f, 17.2422f, 3.9961f)
                curveTo(17.2377f, 4.0629f, 17.2316f, 4.0913f, 17.2297f, 4.0987f)
                curveTo(17.2044f, 4.1575f, 17.1575f, 4.2044f, 17.0987f, 4.2297f)
                curveTo(17.0913f, 4.2316f, 17.0629f, 4.2377f, 16.9961f, 4.2422f)
                curveTo(16.8881f, 4.2496f, 16.7432f, 4.25f, 16.5f, 4.25f)
                close()
            }
        }
            .build()
        return _jarOfPills!!
    }

private var _jarOfPills: ImageVector? = null
