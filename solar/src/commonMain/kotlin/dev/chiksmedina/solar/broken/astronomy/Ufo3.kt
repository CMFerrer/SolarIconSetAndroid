package dev.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Ufo3: ImageVector
    get() {
        if (_ufo3 != null) {
            return _ufo3!!
        }
        _ufo3 = Builder(
            name = "Ufo3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.636f, 20.364f)
                lineTo(7.7573f, 16.2427f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.9998f, 21.9995f)
                lineTo(12.707f, 19.7781f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0002f, 14.0f)
                lineTo(4.2219f, 11.293f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.8563f, 3.9995f)
                curveTo(9.0055f, 4.0886f, 10.4349f, 4.6358f, 11.9467f, 5.5598f)
                moveTo(5.2737f, 6.5822f)
                curveTo(5.4389f, 8.7129f, 7.1792f, 11.8075f, 9.9757f, 14.6039f)
                curveTo(13.8821f, 18.5103f, 18.3701f, 20.3558f, 20.0f, 18.7259f)
                curveTo(20.8256f, 17.9003f, 20.7596f, 16.3416f, 19.9858f, 14.4966f)
                curveTo(19.7357f, 13.9002f, 19.4116f, 13.274f, 19.0199f, 12.6329f)
                moveTo(14.2184f, 10.3615f)
                curveTo(11.9622f, 8.1053f, 11.4919f, 6.8832f, 11.4026f, 6.3867f)
                curveTo(11.3713f, 6.2122f, 11.4554f, 6.0514f, 11.5807f, 5.9261f)
                curveTo(13.4274f, 4.0794f, 16.4219f, 4.0798f, 18.2692f, 5.9271f)
                lineTo(18.6529f, 6.3108f)
                curveTo(20.5001f, 8.158f, 20.5006f, 11.1525f, 18.6539f, 12.9992f)
                curveTo(18.5285f, 13.1246f, 18.3674f, 13.2086f, 18.1929f, 13.1772f)
                curveTo(17.8559f, 13.1166f, 17.1854f, 12.8806f, 16.0851f, 12.0314f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0285f, 13.2712f)
                curveTo(12.6379f, 13.6617f, 12.0048f, 13.6617f, 11.6142f, 13.2712f)
                curveTo(11.2237f, 12.8807f, 11.2237f, 12.2475f, 11.6142f, 11.857f)
                curveTo(12.0048f, 11.4665f, 12.6379f, 11.4665f, 13.0285f, 11.857f)
                curveTo(13.419f, 12.2475f, 13.419f, 12.8807f, 13.0285f, 13.2712f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2f, 9.0286f)
                curveTo(9.8095f, 9.4191f, 9.1763f, 9.4191f, 8.7858f, 9.0286f)
                curveTo(8.3953f, 8.638f, 8.3953f, 8.0049f, 8.7858f, 7.6143f)
                curveTo(9.1763f, 7.2238f, 9.8095f, 7.2238f, 10.2f, 7.6143f)
                curveTo(10.5906f, 8.0049f, 10.5906f, 8.638f, 10.2f, 9.0286f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2711f, 16.0996f)
                curveTo(16.8806f, 16.4901f, 16.2474f, 16.4901f, 15.8569f, 16.0996f)
                curveTo(15.4664f, 15.7091f, 15.4664f, 15.0759f, 15.8569f, 14.6854f)
                curveTo(16.2474f, 14.2949f, 16.8806f, 14.2949f, 17.2711f, 14.6854f)
                curveTo(17.6616f, 15.0759f, 17.6616f, 15.7091f, 17.2711f, 16.0996f)
                close()
            }
        }
            .build()
        return _ufo3!!
    }

private var _ufo3: ImageVector? = null
