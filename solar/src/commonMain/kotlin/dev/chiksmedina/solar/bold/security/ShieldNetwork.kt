package dev.chiksmedina.solar.bold.security

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
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.ShieldNetwork: ImageVector
    get() {
        if (_shieldNetwork != null) {
            return _shieldNetwork!!
        }
        _shieldNetwork = Builder(
            name = "ShieldNetwork", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9438f, 7.7676f)
                curveTo(11.9785f, 7.7503f, 11.9956f, 7.75f, 12.0f, 7.75f)
                curveTo(12.0044f, 7.75f, 12.0215f, 7.7503f, 12.0562f, 7.7676f)
                curveTo(12.0936f, 7.7862f, 12.1518f, 7.8249f, 12.2259f, 7.9016f)
                curveTo(12.3786f, 8.0597f, 12.5539f, 8.3331f, 12.7179f, 8.743f)
                curveTo(12.8795f, 9.1471f, 13.0143f, 9.6443f, 13.1078f, 10.2092f)
                curveTo(13.1631f, 10.5427f, 13.2027f, 10.8921f, 13.2259f, 11.25f)
                horizontalLineTo(10.7741f)
                curveTo(10.7973f, 10.8921f, 10.8369f, 10.5427f, 10.8922f, 10.2092f)
                curveTo(10.9857f, 9.6443f, 11.1205f, 9.1471f, 11.2821f, 8.743f)
                curveTo(11.4461f, 8.3331f, 11.6214f, 8.0597f, 11.7741f, 7.9016f)
                curveTo(11.8482f, 7.8249f, 11.9064f, 7.7862f, 11.9438f, 7.7676f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.2713f, 11.25f)
                curveTo(9.2964f, 10.811f, 9.3436f, 10.379f, 9.4123f, 9.964f)
                curveTo(9.5089f, 9.3811f, 9.6479f, 8.8331f, 9.8274f, 8.3473f)
                curveTo(9.5247f, 8.5273f, 9.2449f, 8.7447f, 8.9948f, 8.9948f)
                curveTo(8.6002f, 9.3894f, 8.2871f, 9.858f, 8.0735f, 10.3736f)
                curveTo(7.9564f, 10.6563f, 7.8705f, 10.9502f, 7.8167f, 11.25f)
                horizontalLineTo(9.2713f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.8167f, 12.75f)
                horizontalLineTo(9.2713f)
                curveTo(9.2964f, 13.189f, 9.3436f, 13.621f, 9.4123f, 14.036f)
                curveTo(9.5089f, 14.6189f, 9.6479f, 15.1669f, 9.8274f, 15.6527f)
                curveTo(9.5247f, 15.4727f, 9.2449f, 15.2553f, 8.9948f, 15.0052f)
                curveTo(8.6002f, 14.6106f, 8.2871f, 14.142f, 8.0735f, 13.6264f)
                curveTo(7.9564f, 13.3437f, 7.8705f, 13.0498f, 7.8167f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1833f, 11.25f)
                curveTo(16.1296f, 10.9502f, 16.0436f, 10.6563f, 15.9265f, 10.3736f)
                curveTo(15.7129f, 9.858f, 15.3999f, 9.3895f, 15.0052f, 8.9948f)
                curveTo(14.7551f, 8.7447f, 14.4753f, 8.5273f, 14.1726f, 8.3473f)
                curveTo(14.3521f, 8.8331f, 14.4911f, 9.3811f, 14.5877f, 9.964f)
                curveTo(14.6564f, 10.379f, 14.7036f, 10.811f, 14.7287f, 11.25f)
                horizontalLineTo(16.1833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.7287f, 12.75f)
                horizontalLineTo(16.1833f)
                curveTo(16.1296f, 13.0498f, 16.0436f, 13.3437f, 15.9265f, 13.6264f)
                curveTo(15.7129f, 14.142f, 15.3999f, 14.6106f, 15.0052f, 15.0052f)
                curveTo(14.7551f, 15.2553f, 14.4753f, 15.4727f, 14.1726f, 15.6527f)
                curveTo(14.3521f, 15.1669f, 14.4911f, 14.6189f, 14.5877f, 14.036f)
                curveTo(14.6564f, 13.621f, 14.7036f, 13.189f, 14.7287f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.2259f, 12.75f)
                curveTo(13.2027f, 13.1079f, 13.1631f, 13.4573f, 13.1078f, 13.7908f)
                curveTo(13.0143f, 14.3557f, 12.8795f, 14.8529f, 12.7179f, 15.257f)
                curveTo(12.5539f, 15.6669f, 12.3786f, 15.9403f, 12.2259f, 16.0984f)
                curveTo(12.1518f, 16.1751f, 12.0936f, 16.2138f, 12.0562f, 16.2324f)
                curveTo(12.0215f, 16.2497f, 12.0044f, 16.25f, 12.0f, 16.25f)
                curveTo(11.9956f, 16.25f, 11.9785f, 16.2497f, 11.9438f, 16.2324f)
                curveTo(11.9064f, 16.2138f, 11.8482f, 16.1751f, 11.7741f, 16.0984f)
                curveTo(11.6214f, 15.9403f, 11.4461f, 15.6669f, 11.2821f, 15.257f)
                curveTo(11.1205f, 14.8529f, 10.9857f, 14.3557f, 10.8922f, 13.7908f)
                curveTo(10.8369f, 13.4573f, 10.7973f, 13.1079f, 10.7741f, 12.75f)
                horizontalLineTo(13.2259f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.3775f, 5.0824f)
                curveTo(3.0f, 5.6203f, 3.0f, 7.2191f, 3.0f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(3.0f, 17.6294f, 7.239f, 20.3655f, 9.8986f, 21.5273f)
                curveTo(10.62f, 21.8424f, 10.9807f, 22.0f, 12.0f, 22.0f)
                curveTo(13.0193f, 22.0f, 13.38f, 21.8424f, 14.1014f, 21.5273f)
                curveTo(16.761f, 20.3655f, 21.0f, 17.6294f, 21.0f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(21.0f, 7.2191f, 21.0f, 5.6203f, 20.6225f, 5.0824f)
                curveTo(20.245f, 4.5445f, 18.7417f, 4.03f, 15.7351f, 3.0008f)
                lineTo(15.1623f, 2.8047f)
                curveTo(13.595f, 2.2682f, 12.8114f, 2.0f, 12.0f, 2.0f)
                curveTo(11.1886f, 2.0f, 10.405f, 2.2682f, 8.8377f, 2.8047f)
                lineTo(8.2649f, 3.0008f)
                curveTo(5.2583f, 4.03f, 3.755f, 4.5445f, 3.3775f, 5.0824f)
                close()
                moveTo(6.25f, 12.0f)
                curveTo(6.25f, 11.2449f, 6.3987f, 10.4972f, 6.6877f, 9.7996f)
                curveTo(6.9767f, 9.1019f, 7.4002f, 8.4681f, 7.9341f, 7.9341f)
                curveTo(8.4681f, 7.4002f, 9.1019f, 6.9767f, 9.7996f, 6.6877f)
                curveTo(10.4972f, 6.3987f, 11.2449f, 6.25f, 12.0f, 6.25f)
                curveTo(12.7551f, 6.25f, 13.5028f, 6.3987f, 14.2004f, 6.6877f)
                curveTo(14.8981f, 6.9767f, 15.5319f, 7.4002f, 16.0659f, 7.9341f)
                curveTo(16.5998f, 8.4681f, 17.0233f, 9.1019f, 17.3123f, 9.7996f)
                curveTo(17.6013f, 10.4972f, 17.75f, 11.2449f, 17.75f, 12.0f)
                curveTo(17.75f, 12.7551f, 17.6013f, 13.5028f, 17.3123f, 14.2004f)
                curveTo(17.0233f, 14.8981f, 16.5998f, 15.5319f, 16.0659f, 16.0659f)
                curveTo(15.5319f, 16.5998f, 14.8981f, 17.0233f, 14.2004f, 17.3123f)
                curveTo(13.5028f, 17.6013f, 12.7551f, 17.75f, 12.0f, 17.75f)
                curveTo(11.2449f, 17.75f, 10.4972f, 17.6013f, 9.7996f, 17.3123f)
                curveTo(9.1019f, 17.0233f, 8.4681f, 16.5998f, 7.9341f, 16.0659f)
                curveTo(7.4002f, 15.5319f, 6.9767f, 14.8981f, 6.6877f, 14.2004f)
                curveTo(6.3987f, 13.5028f, 6.25f, 12.7551f, 6.25f, 12.0f)
                close()
            }
        }
            .build()
        return _shieldNetwork!!
    }

private var _shieldNetwork: ImageVector? = null
