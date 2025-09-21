package dev.chiksmedina.solar.bold.search

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
import dev.chiksmedina.solar.bold.SearchGroup

val SearchGroup.RoundedMagniferBug: ImageVector
    get() {
        if (_roundedMagniferBug != null) {
            return _roundedMagniferBug!!
        }
        _roundedMagniferBug = Builder(
            name = "RoundedMagniferBug", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.8194f, 19.7006f)
                curveTo(17.7302f, 18.6064f, 18.6357f, 17.6929f, 19.7205f, 17.783f)
                curveTo(19.9086f, 17.7986f, 20.1337f, 17.8671f, 20.363f, 17.9368f)
                curveTo(20.3851f, 17.9435f, 20.4073f, 17.9502f, 20.4294f, 17.9569f)
                curveTo(20.4494f, 17.9629f, 20.4694f, 17.9689f, 20.4894f, 17.975f)
                curveTo(20.7001f, 18.0383f, 20.9097f, 18.1013f, 21.0692f, 18.1874f)
                curveTo(21.9844f, 18.6818f, 22.2799f, 19.8631f, 21.7067f, 20.7363f)
                curveTo(21.6068f, 20.8884f, 21.4519f, 21.0441f, 21.2962f, 21.2007f)
                curveTo(21.2814f, 21.2156f, 21.2666f, 21.2305f, 21.2519f, 21.2454f)
                curveTo(21.2371f, 21.2602f, 21.2224f, 21.2752f, 21.2076f, 21.2901f)
                curveTo(21.0524f, 21.4471f, 20.898f, 21.6034f, 20.7472f, 21.7041f)
                curveTo(19.8816f, 22.2823f, 18.7105f, 21.9843f, 18.2204f, 21.0611f)
                curveTo(18.135f, 20.9002f, 18.0726f, 20.6888f, 18.0097f, 20.4762f)
                curveTo(18.0038f, 20.4561f, 17.9978f, 20.4359f, 17.9918f, 20.4157f)
                curveTo(17.9852f, 20.3934f, 17.9785f, 20.3711f, 17.9719f, 20.3488f)
                curveTo(17.9028f, 20.1175f, 17.8349f, 19.8903f, 17.8194f, 19.7006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.1278f, 11.1429f)
                curveTo(20.1278f, 16.1924f, 16.0697f, 20.2858f, 11.0639f, 20.2858f)
                curveTo(6.058f, 20.2858f, 2.0f, 16.1924f, 2.0f, 11.1429f)
                curveTo(2.0f, 6.0934f, 6.058f, 2.0f, 11.0639f, 2.0f)
                curveTo(16.0697f, 2.0f, 20.1278f, 6.0934f, 20.1278f, 11.1429f)
                close()
                moveTo(8.1895f, 7.8604f)
                curveTo(8.8434f, 7.0321f, 9.8593f, 6.5f, 11.0001f, 6.5f)
                curveTo(12.1409f, 6.5f, 13.1568f, 7.0321f, 13.8106f, 7.8604f)
                lineTo(14.4902f, 7.5224f)
                curveTo(14.843f, 7.3469f, 15.272f, 7.4892f, 15.4485f, 7.8401f)
                curveTo(15.6249f, 8.1911f, 15.4819f, 8.6179f, 15.129f, 8.7934f)
                lineTo(14.4502f, 9.1311f)
                curveTo(14.5293f, 9.425f, 14.5715f, 9.7339f, 14.5715f, 10.0526f)
                verticalLineTo(10.2895f)
                horizontalLineTo(15.2857f)
                curveTo(15.6802f, 10.2895f, 16.0f, 10.6076f, 16.0f, 11.0f)
                curveTo(16.0f, 11.3924f, 15.6802f, 11.7105f, 15.2857f, 11.7105f)
                horizontalLineTo(14.5715f)
                verticalLineTo(11.9474f)
                curveTo(14.5715f, 12.2661f, 14.5293f, 12.575f, 14.4502f, 12.8689f)
                lineTo(15.129f, 13.2066f)
                curveTo(15.4819f, 13.3821f, 15.6249f, 13.8089f, 15.4485f, 14.1599f)
                curveTo(15.272f, 14.5108f, 14.843f, 14.6531f, 14.4902f, 14.4776f)
                lineTo(13.8106f, 14.1396f)
                curveTo(13.1568f, 14.9679f, 12.1409f, 15.5f, 11.0001f, 15.5f)
                curveTo(9.8593f, 15.5f, 8.8434f, 14.9679f, 8.1895f, 14.1396f)
                lineTo(7.51f, 14.4776f)
                curveTo(7.1571f, 14.6531f, 6.7281f, 14.5108f, 6.5517f, 14.1599f)
                curveTo(6.3752f, 13.8089f, 6.5183f, 13.3821f, 6.8711f, 13.2066f)
                lineTo(7.55f, 12.8689f)
                curveTo(7.4708f, 12.575f, 7.4286f, 12.2661f, 7.4286f, 11.9474f)
                verticalLineTo(11.7105f)
                horizontalLineTo(6.7143f)
                curveTo(6.3198f, 11.7105f, 6.0f, 11.3924f, 6.0f, 11.0f)
                curveTo(6.0f, 10.6076f, 6.3198f, 10.2895f, 6.7143f, 10.2895f)
                horizontalLineTo(7.4286f)
                verticalLineTo(10.0526f)
                curveTo(7.4286f, 9.7339f, 7.4708f, 9.425f, 7.55f, 9.1311f)
                lineTo(6.8711f, 8.7934f)
                curveTo(6.5183f, 8.6179f, 6.3752f, 8.1911f, 6.5517f, 7.8401f)
                curveTo(6.7281f, 7.4892f, 7.1571f, 7.3469f, 7.51f, 7.5224f)
                lineTo(8.1895f, 7.8604f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7144f, 13.9577f)
                verticalLineTo(10.7632f)
                horizontalLineTo(13.1429f)
                verticalLineTo(11.9474f)
                curveTo(13.1429f, 12.8755f, 12.5466f, 13.665f, 11.7144f, 13.9577f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.8572f, 11.9474f)
                verticalLineTo(10.7632f)
                horizontalLineTo(10.2858f)
                verticalLineTo(13.9577f)
                curveTo(9.4535f, 13.665f, 8.8572f, 12.8755f, 8.8572f, 11.9474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.9791f, 9.3421f)
                curveTo(9.2733f, 8.5142f, 10.0671f, 7.9211f, 11.0001f, 7.9211f)
                curveTo(11.9331f, 7.9211f, 12.7268f, 8.5142f, 13.021f, 9.3421f)
                horizontalLineTo(8.9791f)
                close()
            }
        }
            .build()
        return _roundedMagniferBug!!
    }

private var _roundedMagniferBug: ImageVector? = null
