package dev.chiksmedina.solar.broken.sports

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
import dev.chiksmedina.solar.broken.SportsGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.6501f, 22.0001f)
                curveTo(13.6501f, 22.4143f, 13.9859f, 22.7501f, 14.4001f, 22.7501f)
                curveTo(14.8143f, 22.7501f, 15.1501f, 22.4143f, 15.1501f, 22.0001f)
                horizontalLineTo(13.6501f)
                close()
                moveTo(12.5646f, 16.246f)
                lineTo(13.0175f, 15.6482f)
                lineTo(13.0175f, 15.6482f)
                lineTo(12.5646f, 16.246f)
                close()
                moveTo(13.749f, 17.2613f)
                lineTo(14.3362f, 16.7947f)
                lineTo(14.3362f, 16.7947f)
                lineTo(13.749f, 17.2613f)
                close()
                moveTo(14.306f, 18.382f)
                lineTo(15.0325f, 18.1956f)
                lineTo(15.0325f, 18.1956f)
                lineTo(14.306f, 18.382f)
                close()
                moveTo(13.5043f, 11.5552f)
                curveTo(13.8108f, 11.2766f, 13.8333f, 10.8022f, 13.5547f, 10.4957f)
                curveTo(13.2761f, 10.1892f, 12.8017f, 10.1667f, 12.4953f, 10.4453f)
                lineTo(13.5043f, 11.5552f)
                close()
                moveTo(10.8521f, 13.1647f)
                lineTo(11.5553f, 13.4255f)
                lineTo(11.5553f, 13.4255f)
                lineTo(10.8521f, 13.1647f)
                close()
                moveTo(10.9217f, 14.7203f)
                lineTo(10.2446f, 15.0429f)
                lineTo(10.2446f, 15.0429f)
                lineTo(10.9217f, 14.7203f)
                close()
                moveTo(13.6501f, 19.9391f)
                verticalLineTo(22.0001f)
                horizontalLineTo(15.1501f)
                verticalLineTo(19.9391f)
                horizontalLineTo(13.6501f)
                close()
                moveTo(12.1117f, 16.8438f)
                curveTo(12.7754f, 17.3466f, 12.999f, 17.5229f, 13.1618f, 17.7278f)
                lineTo(14.3362f, 16.7947f)
                curveTo(14.028f, 16.4067f, 13.6189f, 16.1038f, 13.0175f, 15.6482f)
                lineTo(12.1117f, 16.8438f)
                close()
                moveTo(15.1501f, 19.9391f)
                curveTo(15.1501f, 19.1846f, 15.1556f, 18.6756f, 15.0325f, 18.1956f)
                lineTo(13.5795f, 18.5683f)
                curveTo(13.6445f, 18.8219f, 13.6501f, 19.1065f, 13.6501f, 19.9391f)
                horizontalLineTo(15.1501f)
                close()
                moveTo(13.1618f, 17.7278f)
                curveTo(13.3586f, 17.9755f, 13.5009f, 18.2619f, 13.5795f, 18.5683f)
                lineTo(15.0325f, 18.1956f)
                curveTo(14.9015f, 17.6849f, 14.6642f, 17.2076f, 14.3362f, 16.7947f)
                lineTo(13.1618f, 17.7278f)
                close()
                moveTo(12.4953f, 10.4453f)
                curveTo(12.0756f, 10.8268f, 11.5504f, 11.2816f, 11.1412f, 11.6689f)
                curveTo(10.9319f, 11.867f, 10.7315f, 12.0671f, 10.5679f, 12.2557f)
                curveTo(10.4194f, 12.4268f, 10.2413f, 12.6547f, 10.1489f, 12.9039f)
                lineTo(11.5553f, 13.4255f)
                curveTo(11.5476f, 13.4463f, 11.5694f, 13.3902f, 11.7009f, 13.2387f)
                curveTo(11.8172f, 13.1046f, 11.9768f, 12.9434f, 12.1724f, 12.7583f)
                curveTo(12.5729f, 12.3792f, 13.0368f, 11.9801f, 13.5043f, 11.5552f)
                lineTo(12.4953f, 10.4453f)
                close()
                moveTo(13.0175f, 15.6482f)
                curveTo(12.53f, 15.2789f, 12.1998f, 15.028f, 11.9621f, 14.8164f)
                curveTo(11.7285f, 14.6085f, 11.6412f, 14.4867f, 11.5988f, 14.3977f)
                lineTo(10.2446f, 15.0429f)
                curveTo(10.4118f, 15.3937f, 10.6681f, 15.6728f, 10.9648f, 15.9368f)
                curveTo(11.2572f, 16.1971f, 11.6436f, 16.4892f, 12.1117f, 16.8438f)
                lineTo(13.0175f, 15.6482f)
                close()
                moveTo(10.1489f, 12.9039f)
                curveTo(9.8905f, 13.6006f, 9.9251f, 14.3721f, 10.2446f, 15.0429f)
                lineTo(11.5988f, 14.3977f)
                curveTo(11.4536f, 14.0928f, 11.4379f, 13.7421f, 11.5553f, 13.4255f)
                lineTo(10.1489f, 12.9039f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.8062f, 9.4728f)
                curveTo(6.1663f, 9.2681f, 6.2924f, 8.8103f, 6.0878f, 8.4502f)
                curveTo(5.8832f, 8.09f, 5.4253f, 7.964f, 5.0652f, 8.1686f)
                lineTo(5.8062f, 9.4728f)
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
                moveTo(8.7381f, 6.2729f)
                curveTo(8.3499f, 6.4176f, 8.1526f, 6.8495f, 8.2972f, 7.2376f)
                curveTo(8.4419f, 7.6258f, 8.8738f, 7.8232f, 9.2619f, 7.6785f)
                lineTo(8.7381f, 6.2729f)
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
                moveTo(9.2619f, 7.6785f)
                curveTo(9.714f, 7.51f, 10.1059f, 7.4197f, 10.5011f, 7.3909f)
                lineTo(10.3924f, 5.8949f)
                curveTo(9.8302f, 5.9358f, 9.2977f, 6.0644f, 8.7381f, 6.2729f)
                lineTo(9.2619f, 7.6785f)
                close()
            }
        }
            .build()
        return _running2!!
    }

private var _running2: ImageVector? = null
