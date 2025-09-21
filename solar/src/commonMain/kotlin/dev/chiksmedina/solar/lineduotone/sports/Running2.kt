package dev.chiksmedina.solar.lineduotone.sports

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
import dev.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.Running2: ImageVector
    get() {
        if (_running2 != null) {
            return _running2!!
        }
        _running2 = Builder(
            name = "Running2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.0f)
                lineTo(7.9992f, 18.2009f)
                curveTo(7.262f, 19.0856f, 6.8934f, 19.5279f, 6.3895f, 19.764f)
                curveTo(5.8855f, 20.0f, 5.3097f, 20.0f, 4.1581f, 20.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.6499f, 22.0001f)
                curveTo(13.6499f, 22.4143f, 13.9857f, 22.7501f, 14.3999f, 22.7501f)
                curveTo(14.8142f, 22.7501f, 15.1499f, 22.4143f, 15.1499f, 22.0001f)
                horizontalLineTo(13.6499f)
                close()
                moveTo(12.5645f, 16.246f)
                lineTo(13.0174f, 15.6482f)
                lineTo(13.0174f, 15.6482f)
                lineTo(12.5645f, 16.246f)
                close()
                moveTo(13.7489f, 17.2613f)
                lineTo(14.3361f, 16.7947f)
                lineTo(14.3361f, 16.7947f)
                lineTo(13.7489f, 17.2613f)
                close()
                moveTo(14.3059f, 18.382f)
                lineTo(15.0323f, 18.1956f)
                lineTo(15.0323f, 18.1956f)
                lineTo(14.3059f, 18.382f)
                close()
                moveTo(13.5041f, 11.5552f)
                curveTo(13.8106f, 11.2766f, 13.8332f, 10.8022f, 13.5546f, 10.4957f)
                curveTo(13.276f, 10.1892f, 12.8016f, 10.1667f, 12.4951f, 10.4453f)
                lineTo(13.5041f, 11.5552f)
                close()
                moveTo(10.852f, 13.1647f)
                lineTo(11.5552f, 13.4255f)
                lineTo(11.5552f, 13.4255f)
                lineTo(10.852f, 13.1647f)
                close()
                moveTo(10.9216f, 14.7203f)
                lineTo(10.2445f, 15.0429f)
                lineTo(10.2445f, 15.0429f)
                lineTo(10.9216f, 14.7203f)
                close()
                moveTo(13.6499f, 19.9391f)
                verticalLineTo(22.0001f)
                horizontalLineTo(15.1499f)
                verticalLineTo(19.9391f)
                horizontalLineTo(13.6499f)
                close()
                moveTo(12.1116f, 16.8438f)
                curveTo(12.7753f, 17.3466f, 12.9988f, 17.5229f, 13.1617f, 17.7278f)
                lineTo(14.3361f, 16.7947f)
                curveTo(14.0279f, 16.4067f, 13.6188f, 16.1038f, 13.0174f, 15.6482f)
                lineTo(12.1116f, 16.8438f)
                close()
                moveTo(15.1499f, 19.9391f)
                curveTo(15.1499f, 19.1846f, 15.1555f, 18.6756f, 15.0323f, 18.1956f)
                lineTo(13.5794f, 18.5683f)
                curveTo(13.6444f, 18.8219f, 13.6499f, 19.1065f, 13.6499f, 19.9391f)
                horizontalLineTo(15.1499f)
                close()
                moveTo(13.1617f, 17.7278f)
                curveTo(13.3584f, 17.9755f, 13.5008f, 18.2619f, 13.5794f, 18.5683f)
                lineTo(15.0323f, 18.1956f)
                curveTo(14.9013f, 17.6849f, 14.6641f, 17.2076f, 14.3361f, 16.7947f)
                lineTo(13.1617f, 17.7278f)
                close()
                moveTo(12.4951f, 10.4453f)
                curveTo(12.0755f, 10.8268f, 11.5503f, 11.2816f, 11.1411f, 11.6689f)
                curveTo(10.9318f, 11.867f, 10.7314f, 12.0671f, 10.5678f, 12.2557f)
                curveTo(10.4193f, 12.4268f, 10.2412f, 12.6547f, 10.1488f, 12.9039f)
                lineTo(11.5552f, 13.4255f)
                curveTo(11.5474f, 13.4463f, 11.5693f, 13.3902f, 11.7007f, 13.2387f)
                curveTo(11.8171f, 13.1046f, 11.9767f, 12.9434f, 12.1722f, 12.7583f)
                curveTo(12.5728f, 12.3792f, 13.0367f, 11.9801f, 13.5041f, 11.5552f)
                lineTo(12.4951f, 10.4453f)
                close()
                moveTo(13.0174f, 15.6482f)
                curveTo(12.5299f, 15.2789f, 12.1997f, 15.028f, 11.9619f, 14.8164f)
                curveTo(11.7284f, 14.6085f, 11.6411f, 14.4867f, 11.5987f, 14.3977f)
                lineTo(10.2445f, 15.0429f)
                curveTo(10.4117f, 15.3937f, 10.668f, 15.6728f, 10.9646f, 15.9368f)
                curveTo(11.2571f, 16.1971f, 11.6435f, 16.4892f, 12.1116f, 16.8438f)
                lineTo(13.0174f, 15.6482f)
                close()
                moveTo(10.1488f, 12.9039f)
                curveTo(9.8904f, 13.6006f, 9.925f, 14.3721f, 10.2445f, 15.0429f)
                lineTo(11.5987f, 14.3977f)
                curveTo(11.4534f, 14.0928f, 11.4377f, 13.7421f, 11.5552f, 13.4255f)
                lineTo(10.1488f, 12.9039f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4357f, 8.8207f)
                lineTo(5.0652f, 8.1686f)
                lineTo(5.0652f, 8.1686f)
                lineTo(5.4357f, 8.8207f)
                close()
                moveTo(3.6295f, 8.9843f)
                curveTo(3.2694f, 9.1889f, 3.1433f, 9.6468f, 3.3479f, 10.0069f)
                curveTo(3.5525f, 10.367f, 4.0104f, 10.4931f, 4.3705f, 10.2885f)
                lineTo(3.6295f, 8.9843f)
                close()
                moveTo(13.4066f, 7.3572f)
                lineTo(13.1211f, 8.0507f)
                lineTo(13.1211f, 8.0507f)
                lineTo(13.4066f, 7.3572f)
                close()
                moveTo(10.4467f, 6.6429f)
                lineTo(10.3924f, 5.8949f)
                lineTo(10.3924f, 5.8949f)
                lineTo(10.4467f, 6.6429f)
                close()
                moveTo(21.0f, 12.75f)
                curveTo(21.4142f, 12.75f, 21.75f, 12.4142f, 21.75f, 12.0f)
                curveTo(21.75f, 11.5858f, 21.4142f, 11.25f, 21.0f, 11.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(15.7681f, 9.5362f)
                lineTo(15.0973f, 9.8716f)
                lineTo(15.0973f, 9.8716f)
                lineTo(15.7681f, 9.5362f)
                close()
                moveTo(5.0652f, 8.1686f)
                lineTo(3.6295f, 8.9843f)
                lineTo(4.3705f, 10.2885f)
                lineTo(5.8062f, 9.4728f)
                lineTo(5.0652f, 8.1686f)
                close()
                moveTo(13.6921f, 6.6637f)
                curveTo(12.3481f, 6.1104f, 11.6111f, 5.8062f, 10.3924f, 5.8949f)
                lineTo(10.5011f, 7.3909f)
                curveTo(11.3248f, 7.331f, 11.7575f, 7.4894f, 13.1211f, 8.0507f)
                lineTo(13.6921f, 6.6637f)
                close()
                moveTo(5.8062f, 9.4728f)
                curveTo(8.3081f, 8.0512f, 9.3585f, 7.474f, 10.5011f, 7.3909f)
                lineTo(10.3924f, 5.8949f)
                curveTo(8.8328f, 6.0083f, 7.4432f, 6.8174f, 5.0652f, 8.1686f)
                lineTo(5.8062f, 9.4728f)
                close()
                moveTo(19.7546f, 12.75f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(19.7546f)
                verticalLineTo(12.75f)
                close()
                moveTo(15.0973f, 9.8716f)
                curveTo(15.9793f, 11.6357f, 17.7823f, 12.75f, 19.7546f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(18.3505f, 11.25f, 17.0669f, 10.4567f, 16.4389f, 9.2008f)
                lineTo(15.0973f, 9.8716f)
                close()
                moveTo(16.4389f, 9.2008f)
                curveTo(15.8611f, 8.0451f, 14.8765f, 7.1512f, 13.6921f, 6.6637f)
                lineTo(13.1211f, 8.0507f)
                curveTo(13.9811f, 8.4047f, 14.6864f, 9.0499f, 15.0973f, 9.8716f)
                lineTo(16.4389f, 9.2008f)
                close()
            }
        }
            .build()
        return _running2!!
    }

private var _running2: ImageVector? = null
