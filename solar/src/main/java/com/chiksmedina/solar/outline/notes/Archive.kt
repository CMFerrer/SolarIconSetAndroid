package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

val NotesGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(
            name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.9553f, 2.25f)
                curveTo(3.9701f, 2.25f, 3.985f, 2.25f, 4.0f, 2.25f)
                lineTo(20.0448f, 2.25f)
                curveTo(20.4776f, 2.2499f, 20.8744f, 2.2499f, 21.1972f, 2.2933f)
                curveTo(21.5527f, 2.3411f, 21.9284f, 2.4536f, 22.2374f, 2.7626f)
                curveTo(22.5465f, 3.0716f, 22.6589f, 3.4473f, 22.7067f, 3.8028f)
                curveTo(22.7501f, 4.1256f, 22.7501f, 4.5224f, 22.75f, 4.9553f)
                verticalLineTo(5.0448f)
                curveTo(22.7501f, 5.4776f, 22.7501f, 5.8744f, 22.7067f, 6.1972f)
                curveTo(22.6589f, 6.5527f, 22.5465f, 6.9284f, 22.2374f, 7.2374f)
                curveTo(21.9437f, 7.5312f, 21.5896f, 7.6473f, 21.25f, 7.6991f)
                verticalLineTo(13.0564f)
                curveTo(21.25f, 14.8942f, 21.25f, 16.3498f, 21.0969f, 17.489f)
                curveTo(20.9392f, 18.6615f, 20.6071f, 19.6104f, 19.8588f, 20.3588f)
                curveTo(19.1104f, 21.1071f, 18.1615f, 21.4392f, 16.989f, 21.5969f)
                curveTo(15.8498f, 21.75f, 14.3942f, 21.75f, 12.5564f, 21.75f)
                horizontalLineTo(11.4436f)
                curveTo(9.6058f, 21.75f, 8.1502f, 21.75f, 7.011f, 21.5969f)
                curveTo(5.8386f, 21.4392f, 4.8896f, 21.1071f, 4.1413f, 20.3588f)
                curveTo(3.3929f, 19.6104f, 3.0608f, 18.6615f, 2.9031f, 17.489f)
                curveTo(2.75f, 16.3498f, 2.75f, 14.8942f, 2.75f, 13.0564f)
                lineTo(2.75f, 7.6991f)
                curveTo(2.4104f, 7.6473f, 2.0563f, 7.5312f, 1.7626f, 7.2374f)
                curveTo(1.4535f, 6.9284f, 1.3411f, 6.5527f, 1.2933f, 6.1972f)
                curveTo(1.2499f, 5.8744f, 1.25f, 5.4776f, 1.25f, 5.0448f)
                curveTo(1.25f, 5.0299f, 1.25f, 5.015f, 1.25f, 5.0f)
                curveTo(1.25f, 4.9851f, 1.25f, 4.9701f, 1.25f, 4.9553f)
                curveTo(1.25f, 4.5224f, 1.2499f, 4.1256f, 1.2933f, 3.8028f)
                curveTo(1.3411f, 3.4473f, 1.4535f, 3.0716f, 1.7626f, 2.7626f)
                curveTo(2.0716f, 2.4536f, 2.4473f, 2.3411f, 2.8028f, 2.2933f)
                curveTo(3.1256f, 2.2499f, 3.5224f, 2.2499f, 3.9553f, 2.25f)
                close()
                moveTo(4.25f, 7.75f)
                verticalLineTo(13.0f)
                curveTo(4.25f, 14.9068f, 4.2516f, 16.2615f, 4.3898f, 17.2892f)
                curveTo(4.525f, 18.2952f, 4.7787f, 18.8749f, 5.2019f, 19.2981f)
                curveTo(5.6251f, 19.7213f, 6.2048f, 19.975f, 7.2109f, 20.1102f)
                curveTo(8.2385f, 20.2484f, 9.5932f, 20.25f, 11.5f, 20.25f)
                horizontalLineTo(12.5f)
                curveTo(14.4068f, 20.25f, 15.7615f, 20.2484f, 16.7892f, 20.1102f)
                curveTo(17.7952f, 19.975f, 18.3749f, 19.7213f, 18.7981f, 19.2981f)
                curveTo(19.2213f, 18.8749f, 19.475f, 18.2952f, 19.6102f, 17.2892f)
                curveTo(19.7484f, 16.2615f, 19.75f, 14.9068f, 19.75f, 13.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(4.25f)
                close()
                moveTo(2.8232f, 3.8232f)
                lineTo(2.8257f, 3.8219f)
                curveTo(2.8276f, 3.8209f, 2.8309f, 3.8192f, 2.836f, 3.8172f)
                curveTo(2.8577f, 3.8082f, 2.9061f, 3.7929f, 3.0027f, 3.7799f)
                curveTo(3.2134f, 3.7516f, 3.5074f, 3.75f, 4.0f, 3.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4926f, 3.75f, 20.7866f, 3.7516f, 20.9973f, 3.7799f)
                curveTo(21.0939f, 3.7929f, 21.1423f, 3.8082f, 21.164f, 3.8172f)
                curveTo(21.1691f, 3.8192f, 21.1724f, 3.8209f, 21.1743f, 3.8219f)
                lineTo(21.1768f, 3.8232f)
                lineTo(21.1781f, 3.8257f)
                curveTo(21.1792f, 3.8276f, 21.1808f, 3.8309f, 21.1828f, 3.836f)
                curveTo(21.1918f, 3.8577f, 21.2071f, 3.9061f, 21.2201f, 4.0027f)
                curveTo(21.2484f, 4.2134f, 21.25f, 4.5074f, 21.25f, 5.0f)
                curveTo(21.25f, 5.4926f, 21.2484f, 5.7866f, 21.2201f, 5.9973f)
                curveTo(21.2071f, 6.0939f, 21.1918f, 6.1423f, 21.1828f, 6.164f)
                curveTo(21.1808f, 6.1691f, 21.1792f, 6.1724f, 21.1781f, 6.1743f)
                lineTo(21.1768f, 6.1768f)
                lineTo(21.1743f, 6.1782f)
                curveTo(21.1724f, 6.1792f, 21.1691f, 6.1808f, 21.164f, 6.1828f)
                curveTo(21.1423f, 6.1918f, 21.0939f, 6.2071f, 20.9973f, 6.2201f)
                curveTo(20.7866f, 6.2484f, 20.4926f, 6.25f, 20.0f, 6.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5074f, 6.25f, 3.2134f, 6.2484f, 3.0027f, 6.2201f)
                curveTo(2.9061f, 6.2071f, 2.8577f, 6.1918f, 2.836f, 6.1828f)
                curveTo(2.8309f, 6.1808f, 2.8276f, 6.1792f, 2.8257f, 6.1782f)
                lineTo(2.8232f, 6.1768f)
                lineTo(2.8219f, 6.1743f)
                curveTo(2.8209f, 6.1724f, 2.8192f, 6.1691f, 2.8172f, 6.164f)
                curveTo(2.8082f, 6.1423f, 2.7929f, 6.0939f, 2.7799f, 5.9973f)
                curveTo(2.7516f, 5.7866f, 2.75f, 5.4926f, 2.75f, 5.0f)
                curveTo(2.75f, 4.5074f, 2.7516f, 4.2134f, 2.7799f, 4.0027f)
                curveTo(2.7929f, 3.9061f, 2.8082f, 3.8577f, 2.8172f, 3.836f)
                curveTo(2.8192f, 3.8309f, 2.8209f, 3.8276f, 2.8219f, 3.8257f)
                lineTo(2.8232f, 3.8232f)
                close()
                moveTo(2.8232f, 6.1768f)
                curveTo(2.823f, 6.1764f, 2.8228f, 6.1764f, 2.8232f, 6.1768f)
                close()
                moveTo(10.4782f, 9.75f)
                horizontalLineTo(13.5218f)
                curveTo(13.736f, 9.75f, 13.9329f, 9.75f, 14.0982f, 9.7613f)
                curveTo(14.2759f, 9.7734f, 14.4712f, 9.801f, 14.6697f, 9.8832f)
                curveTo(15.0985f, 10.0608f, 15.4392f, 10.4015f, 15.6168f, 10.8303f)
                curveTo(15.699f, 11.0288f, 15.7266f, 11.2242f, 15.7388f, 11.4018f)
                curveTo(15.75f, 11.5671f, 15.75f, 11.764f, 15.75f, 11.9782f)
                verticalLineTo(12.0218f)
                curveTo(15.75f, 12.236f, 15.75f, 12.4329f, 15.7388f, 12.5982f)
                curveTo(15.7266f, 12.7759f, 15.699f, 12.9712f, 15.6168f, 13.1697f)
                curveTo(15.4392f, 13.5985f, 15.0985f, 13.9392f, 14.6697f, 14.1168f)
                curveTo(14.4712f, 14.199f, 14.2759f, 14.2266f, 14.0982f, 14.2388f)
                curveTo(13.9329f, 14.25f, 13.736f, 14.25f, 13.5218f, 14.25f)
                horizontalLineTo(10.4782f)
                curveTo(10.264f, 14.25f, 10.0671f, 14.25f, 9.9018f, 14.2388f)
                curveTo(9.7241f, 14.2266f, 9.5288f, 14.199f, 9.3303f, 14.1168f)
                curveTo(8.9015f, 13.9392f, 8.5608f, 13.5985f, 8.3832f, 13.1697f)
                curveTo(8.301f, 12.9712f, 8.2734f, 12.7759f, 8.2613f, 12.5982f)
                curveTo(8.25f, 12.4329f, 8.25f, 12.236f, 8.25f, 12.0218f)
                verticalLineTo(11.9782f)
                curveTo(8.25f, 11.764f, 8.25f, 11.5671f, 8.2613f, 11.4018f)
                curveTo(8.2734f, 11.2242f, 8.301f, 11.0288f, 8.3832f, 10.8303f)
                curveTo(8.5608f, 10.4015f, 8.9015f, 10.0608f, 9.3303f, 9.8832f)
                curveTo(9.5288f, 9.801f, 9.7241f, 9.7734f, 9.9018f, 9.7613f)
                curveTo(10.0671f, 9.75f, 10.264f, 9.75f, 10.4782f, 9.75f)
                close()
                moveTo(9.9013f, 11.2703f)
                curveTo(9.8425f, 11.2956f, 9.7956f, 11.3425f, 9.7703f, 11.4013f)
                curveTo(9.7684f, 11.4087f, 9.7623f, 11.4371f, 9.7578f, 11.5039f)
                curveTo(9.7504f, 11.6119f, 9.75f, 11.7568f, 9.75f, 12.0f)
                curveTo(9.75f, 12.2432f, 9.7504f, 12.3881f, 9.7578f, 12.4961f)
                curveTo(9.7623f, 12.5629f, 9.7684f, 12.5913f, 9.7703f, 12.5987f)
                curveTo(9.7956f, 12.6575f, 9.8425f, 12.7044f, 9.9013f, 12.7297f)
                curveTo(9.9087f, 12.7316f, 9.9371f, 12.7377f, 10.0039f, 12.7422f)
                curveTo(10.1119f, 12.7496f, 10.2568f, 12.75f, 10.5f, 12.75f)
                horizontalLineTo(13.5f)
                curveTo(13.7432f, 12.75f, 13.8881f, 12.7496f, 13.9961f, 12.7422f)
                curveTo(14.0629f, 12.7377f, 14.0913f, 12.7316f, 14.0987f, 12.7297f)
                curveTo(14.1575f, 12.7044f, 14.2044f, 12.6575f, 14.2297f, 12.5987f)
                curveTo(14.2316f, 12.5913f, 14.2377f, 12.5629f, 14.2422f, 12.4961f)
                curveTo(14.2496f, 12.3881f, 14.25f, 12.2432f, 14.25f, 12.0f)
                curveTo(14.25f, 11.7568f, 14.2496f, 11.6119f, 14.2422f, 11.5039f)
                curveTo(14.2377f, 11.4371f, 14.2316f, 11.4087f, 14.2297f, 11.4013f)
                curveTo(14.2044f, 11.3425f, 14.1575f, 11.2956f, 14.0987f, 11.2703f)
                curveTo(14.0913f, 11.2684f, 14.0629f, 11.2623f, 13.9961f, 11.2578f)
                curveTo(13.8881f, 11.2504f, 13.7432f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(10.5f)
                curveTo(10.2568f, 11.25f, 10.1119f, 11.2504f, 10.0039f, 11.2578f)
                curveTo(9.9371f, 11.2623f, 9.9087f, 11.2684f, 9.9013f, 11.2703f)
                close()
            }
        }
            .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
