package com.chiksmedina.solar.outline.like

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
import com.chiksmedina.solar.outline.LikeGroup

val LikeGroup.HeartShine: ImageVector
    get() {
        if (_heartShine != null) {
            return _heartShine!!
        }
        _heartShine = Builder(
            name = "HeartShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.8987f)
                curveTo(11.0286f, 8.1751f, 9.9371f, 8.0745f, 9.009f, 8.5057f)
                curveTo(7.9533f, 8.9963f, 7.25f, 10.1171f, 7.25f, 11.3796f)
                curveTo(7.25f, 12.5983f, 7.7541f, 13.5245f, 8.3862f, 14.248f)
                curveTo(8.8836f, 14.8174f, 9.497f, 15.297f, 10.0018f, 15.6917f)
                curveTo(10.1123f, 15.7782f, 10.2179f, 15.8608f, 10.3157f, 15.9391f)
                curveTo(10.5164f, 16.0999f, 10.7605f, 16.2953f, 11.0151f, 16.4465f)
                curveTo(11.269f, 16.5974f, 11.6065f, 16.75f, 12.0f, 16.75f)
                curveTo(12.3935f, 16.75f, 12.731f, 16.5974f, 12.9849f, 16.4465f)
                curveTo(13.2395f, 16.2953f, 13.4836f, 16.0999f, 13.6843f, 15.9391f)
                curveTo(13.7822f, 15.8607f, 13.8876f, 15.7783f, 13.9982f, 15.6917f)
                curveTo(14.503f, 15.297f, 15.1164f, 14.8174f, 15.6138f, 14.248f)
                curveTo(16.2459f, 13.5245f, 16.75f, 12.5983f, 16.75f, 11.3796f)
                curveTo(16.75f, 10.1171f, 16.0467f, 8.9963f, 14.991f, 8.5057f)
                curveTo(14.0629f, 8.0745f, 12.9714f, 8.1751f, 12.0f, 8.8987f)
                close()
                moveTo(9.6411f, 9.866f)
                curveTo(9.1467f, 10.0958f, 8.75f, 10.6647f, 8.75f, 11.3796f)
                curveTo(8.75f, 12.1383f, 9.0498f, 12.7276f, 9.5158f, 13.2611f)
                curveTo(9.9104f, 13.7127f, 10.3834f, 14.0838f, 10.8818f, 14.4747f)
                curveTo(11.0044f, 14.5709f, 11.1288f, 14.6685f, 11.2537f, 14.7686f)
                curveTo(11.4683f, 14.9406f, 11.6318f, 15.0682f, 11.7811f, 15.1569f)
                curveTo(11.931f, 15.2459f, 11.9935f, 15.25f, 12.0f, 15.25f)
                curveTo(12.0065f, 15.25f, 12.069f, 15.2459f, 12.2189f, 15.1569f)
                curveTo(12.3682f, 15.0682f, 12.5317f, 14.9406f, 12.7463f, 14.7686f)
                curveTo(12.8713f, 14.6684f, 12.9955f, 14.571f, 13.1182f, 14.4747f)
                curveTo(13.6166f, 14.0838f, 14.0896f, 13.7127f, 14.4842f, 13.2611f)
                curveTo(14.9502f, 12.7276f, 15.25f, 12.1383f, 15.25f, 11.3796f)
                curveTo(15.25f, 10.6647f, 14.8533f, 10.0958f, 14.3589f, 9.866f)
                curveTo(13.9153f, 9.6599f, 13.2539f, 9.6674f, 12.5446f, 10.4166f)
                curveTo(12.403f, 10.5662f, 12.206f, 10.651f, 12.0f, 10.651f)
                curveTo(11.794f, 10.651f, 11.597f, 10.5662f, 11.4554f, 10.4166f)
                curveTo(10.7461f, 9.6674f, 10.0847f, 9.6599f, 9.6411f, 9.866f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 20.0f)
                curveTo(12.75f, 19.5858f, 12.4142f, 19.25f, 12.0f, 19.25f)
                curveTo(11.5858f, 19.25f, 11.25f, 19.5858f, 11.25f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 11.25f)
                curveTo(19.5858f, 11.25f, 19.25f, 11.5858f, 19.25f, 12.0f)
                curveTo(19.25f, 12.4142f, 19.5858f, 12.75f, 20.0f, 12.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 12.75f, 22.75f, 12.4142f, 22.75f, 12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                horizontalLineTo(20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4697f, 18.5303f)
                curveTo(5.1768f, 18.2374f, 5.1768f, 17.7626f, 5.4697f, 17.4697f)
                lineTo(5.8127f, 17.1266f)
                curveTo(6.1056f, 16.8337f, 6.5805f, 16.8337f, 6.8734f, 17.1266f)
                curveTo(7.1663f, 17.4195f, 7.1663f, 17.8944f, 6.8734f, 18.1873f)
                lineTo(6.5303f, 18.5303f)
                curveTo(6.2374f, 18.8232f, 5.7626f, 18.8232f, 5.4697f, 18.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1264f, 5.8129f)
                curveTo(16.8335f, 6.1058f, 16.8335f, 6.5807f, 17.1264f, 6.8736f)
                curveTo(17.4193f, 7.1665f, 17.8942f, 7.1665f, 18.1871f, 6.8736f)
                lineTo(18.5303f, 6.5303f)
                curveTo(18.8232f, 6.2374f, 18.8232f, 5.7626f, 18.5303f, 5.4697f)
                curveTo(18.2374f, 5.1768f, 17.7626f, 5.1768f, 17.4697f, 5.4697f)
                lineTo(17.1264f, 5.8129f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.5303f, 18.5303f)
                curveTo(18.8232f, 18.2374f, 18.8232f, 17.7626f, 18.5303f, 17.4697f)
                lineTo(18.1873f, 17.1266f)
                curveTo(17.8944f, 16.8337f, 17.4195f, 16.8337f, 17.1266f, 17.1266f)
                curveTo(16.8337f, 17.4195f, 16.8337f, 17.8944f, 17.1266f, 18.1873f)
                lineTo(17.4697f, 18.5303f)
                curveTo(17.7626f, 18.8232f, 18.2374f, 18.8232f, 18.5303f, 18.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.8736f, 5.8129f)
                curveTo(7.1665f, 6.1058f, 7.1665f, 6.5807f, 6.8736f, 6.8736f)
                curveTo(6.5807f, 7.1665f, 6.1058f, 7.1665f, 5.8129f, 6.8736f)
                lineTo(5.4697f, 6.5303f)
                curveTo(5.1768f, 6.2374f, 5.1768f, 5.7626f, 5.4697f, 5.4697f)
                curveTo(5.7626f, 5.1768f, 6.2374f, 5.1768f, 6.5303f, 5.4697f)
                lineTo(6.8736f, 5.8129f)
                close()
            }
        }
            .build()
        return _heartShine!!
    }

private var _heartShine: ImageVector? = null
