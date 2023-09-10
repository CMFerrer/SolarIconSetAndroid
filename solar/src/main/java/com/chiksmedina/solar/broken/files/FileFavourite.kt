package com.chiksmedina.solar.broken.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.FilesGroup

val FilesGroup.FileFavourite: ImageVector
    get() {
        if (_fileFavourite != null) {
            return _fileFavourite!!
        }
        _fileFavourite = Builder(
            name = "FileFavourite", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 2.5f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 7.357f, 13.0f, 8.5355f, 13.7322f, 9.2678f)
                curveTo(14.4645f, 10.0f, 15.643f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.146f, 13.0225f)
                curveTo(8.5259f, 12.3408f, 8.7159f, 12.0f, 9.0f, 12.0f)
                curveTo(9.2841f, 12.0f, 9.4741f, 12.3408f, 9.854f, 13.0225f)
                lineTo(9.9524f, 13.1989f)
                curveTo(10.0603f, 13.3926f, 10.1143f, 13.4894f, 10.1985f, 13.5533f)
                curveTo(10.2827f, 13.6172f, 10.3875f, 13.641f, 10.5972f, 13.6884f)
                lineTo(10.7881f, 13.7316f)
                curveTo(11.526f, 13.8986f, 11.895f, 13.982f, 11.9828f, 14.2643f)
                curveTo(12.0706f, 14.5466f, 11.819f, 14.8407f, 11.316f, 15.429f)
                lineTo(11.1858f, 15.5812f)
                curveTo(11.0429f, 15.7483f, 10.9714f, 15.8319f, 10.9392f, 15.9353f)
                curveTo(10.9071f, 16.0387f, 10.9179f, 16.1502f, 10.9395f, 16.3733f)
                lineTo(10.9592f, 16.5763f)
                curveTo(11.0352f, 17.3612f, 11.0733f, 17.7536f, 10.8435f, 17.9281f)
                curveTo(10.6136f, 18.1025f, 10.2682f, 17.9435f, 9.5773f, 17.6254f)
                lineTo(9.3986f, 17.5431f)
                curveTo(9.2022f, 17.4527f, 9.1041f, 17.4075f, 9.0f, 17.4075f)
                curveTo(8.8959f, 17.4075f, 8.7978f, 17.4527f, 8.6014f, 17.5431f)
                lineTo(8.4227f, 17.6254f)
                curveTo(7.7318f, 17.9435f, 7.3864f, 18.1025f, 7.1565f, 17.9281f)
                curveTo(6.9267f, 17.7536f, 6.9648f, 17.3612f, 7.0408f, 16.5763f)
                lineTo(7.0605f, 16.3733f)
                curveTo(7.0821f, 16.1502f, 7.0929f, 16.0387f, 7.0608f, 15.9353f)
                curveTo(7.0286f, 15.8319f, 6.9571f, 15.7483f, 6.8142f, 15.5812f)
                lineTo(6.684f, 15.429f)
                curveTo(6.181f, 14.8407f, 5.9295f, 14.5466f, 6.0172f, 14.2643f)
                curveTo(6.105f, 13.982f, 6.474f, 13.8986f, 7.2119f, 13.7316f)
                lineTo(7.4028f, 13.6884f)
                curveTo(7.6125f, 13.641f, 7.7173f, 13.6172f, 7.8015f, 13.5533f)
                curveTo(7.8857f, 13.4894f, 7.9397f, 13.3926f, 8.0476f, 13.1989f)
                lineTo(8.146f, 13.0225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 10.0f)
                curveTo(2.75f, 9.5858f, 2.4142f, 9.25f, 2.0f, 9.25f)
                curveTo(1.5858f, 9.25f, 1.25f, 9.5858f, 1.25f, 10.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 14.4142f, 21.5858f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 14.4142f, 22.75f, 14.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(15.3929f, 4.0536f)
                lineTo(14.8912f, 4.6111f)
                lineTo(14.8912f, 4.6111f)
                lineTo(15.3929f, 4.0536f)
                close()
                moveTo(19.3517f, 7.6165f)
                lineTo(18.85f, 8.174f)
                lineTo(18.85f, 8.174f)
                lineTo(19.3517f, 7.6165f)
                close()
                moveTo(21.654f, 10.1541f)
                lineTo(20.9689f, 10.4592f)
                lineTo(20.9689f, 10.4592f)
                lineTo(21.654f, 10.1541f)
                close()
                moveTo(3.1716f, 20.8284f)
                lineTo(3.7019f, 20.2981f)
                lineTo(3.7019f, 20.2981f)
                lineTo(3.1716f, 20.8284f)
                close()
                moveTo(20.8284f, 20.8284f)
                lineTo(20.2981f, 20.2981f)
                lineTo(20.2981f, 20.2981f)
                lineTo(20.8284f, 20.8284f)
                close()
                moveTo(1.3551f, 5.9266f)
                curveTo(1.3146f, 6.3388f, 1.6158f, 6.7059f, 2.0281f, 6.7464f)
                curveTo(2.4403f, 6.787f, 2.8073f, 6.4856f, 2.8479f, 6.0734f)
                lineTo(1.3551f, 5.9266f)
                close()
                moveTo(22.6449f, 18.0734f)
                curveTo(22.6855f, 17.6612f, 22.3841f, 17.2941f, 21.9719f, 17.2536f)
                curveTo(21.5597f, 17.2131f, 21.1927f, 17.5144f, 21.1521f, 17.9266f)
                lineTo(22.6449f, 18.0734f)
                close()
                moveTo(14.0f, 21.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.25f)
                close()
                moveTo(2.75f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(21.25f, 13.5629f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(13.5629f)
                horizontalLineTo(21.25f)
                close()
                moveTo(14.8912f, 4.6111f)
                lineTo(18.85f, 8.174f)
                lineTo(19.8534f, 7.0591f)
                lineTo(15.8947f, 3.4962f)
                lineTo(14.8912f, 4.6111f)
                close()
                moveTo(22.75f, 13.5629f)
                curveTo(22.75f, 11.8745f, 22.7651f, 10.8055f, 22.3391f, 9.849f)
                lineTo(20.9689f, 10.4592f)
                curveTo(21.2349f, 11.0565f, 21.25f, 11.742f, 21.25f, 13.5629f)
                horizontalLineTo(22.75f)
                close()
                moveTo(18.85f, 8.174f)
                curveTo(20.2034f, 9.3921f, 20.7029f, 9.862f, 20.9689f, 10.4592f)
                lineTo(22.3391f, 9.849f)
                curveTo(21.9131f, 8.8924f, 21.1084f, 8.1885f, 19.8534f, 7.0591f)
                lineTo(18.85f, 8.174f)
                close()
                moveTo(10.0298f, 2.75f)
                curveTo(11.6116f, 2.75f, 12.2085f, 2.7616f, 12.7405f, 2.9657f)
                lineTo(13.2779f, 1.5653f)
                curveTo(12.4261f, 1.2384f, 11.498f, 1.25f, 10.0298f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(15.8947f, 3.4962f)
                curveTo(14.8087f, 2.5188f, 14.1297f, 1.8921f, 13.2779f, 1.5653f)
                lineTo(12.7405f, 2.9657f)
                curveTo(13.2727f, 3.1699f, 13.7215f, 3.5584f, 14.8912f, 4.6111f)
                lineTo(15.8947f, 3.4962f)
                close()
                moveTo(10.0f, 21.25f)
                curveTo(8.0932f, 21.25f, 6.7385f, 21.2484f, 5.7108f, 21.1102f)
                curveTo(4.7048f, 20.975f, 4.1251f, 20.7213f, 3.7019f, 20.2981f)
                lineTo(2.6412f, 21.3588f)
                curveTo(3.3896f, 22.1071f, 4.3386f, 22.4392f, 5.511f, 22.5969f)
                curveTo(6.6618f, 22.7516f, 8.1356f, 22.75f, 10.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(1.25f, 14.0f)
                curveTo(1.25f, 15.8644f, 1.2484f, 17.3382f, 1.4031f, 18.489f)
                curveTo(1.5608f, 19.6614f, 1.8929f, 20.6104f, 2.6412f, 21.3588f)
                lineTo(3.7019f, 20.2981f)
                curveTo(3.2787f, 19.8749f, 3.025f, 19.2952f, 2.8898f, 18.2892f)
                curveTo(2.7516f, 17.2615f, 2.75f, 15.9068f, 2.75f, 14.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(14.0f, 22.75f)
                curveTo(15.8644f, 22.75f, 17.3382f, 22.7516f, 18.489f, 22.5969f)
                curveTo(19.6614f, 22.4392f, 20.6104f, 22.1071f, 21.3588f, 21.3588f)
                lineTo(20.2981f, 20.2981f)
                curveTo(19.8749f, 20.7213f, 19.2952f, 20.975f, 18.2892f, 21.1102f)
                curveTo(17.2615f, 21.2484f, 15.9068f, 21.25f, 14.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(10.0298f, 1.25f)
                curveTo(8.1554f, 1.25f, 6.6744f, 1.2484f, 5.5189f, 1.4031f)
                curveTo(4.3423f, 1.5605f, 3.3902f, 1.8923f, 2.6412f, 2.6412f)
                lineTo(3.7019f, 3.7019f)
                curveTo(4.1245f, 3.2793f, 4.706f, 3.0252f, 5.7179f, 2.8898f)
                curveTo(6.7508f, 2.7516f, 8.1131f, 2.75f, 10.0298f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(2.8479f, 6.0734f)
                curveTo(2.9693f, 4.839f, 3.2304f, 4.1733f, 3.7019f, 3.7019f)
                lineTo(2.6412f, 2.6412f)
                curveTo(1.8063f, 3.4762f, 1.4894f, 4.5607f, 1.3551f, 5.9266f)
                lineTo(2.8479f, 6.0734f)
                close()
                moveTo(21.1521f, 17.9266f)
                curveTo(21.0307f, 19.1609f, 20.7695f, 19.8266f, 20.2981f, 20.2981f)
                lineTo(21.3588f, 21.3588f)
                curveTo(22.1937f, 20.5238f, 22.5106f, 19.4393f, 22.6449f, 18.0734f)
                lineTo(21.1521f, 17.9266f)
                close()
            }
        }
            .build()
        return _fileFavourite!!
    }

private var _fileFavourite: ImageVector? = null
