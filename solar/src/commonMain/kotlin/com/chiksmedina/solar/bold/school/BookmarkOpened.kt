package com.chiksmedina.solar.bold.school

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
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.BookmarkOpened: ImageVector
    get() {
        if (_bookmarkOpened != null) {
            return _bookmarkOpened!!
        }
        _bookmarkOpened = Builder(
            name = "BookmarkOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.1184f, 2.0f, 10.3192f, 2.0096f, 9.5929f)
                curveTo(2.066f, 9.3981f, 2.1333f, 9.2273f, 2.2132f, 9.0705f)
                curveTo(2.6207f, 8.2709f, 3.2708f, 7.6207f, 4.0705f, 7.2132f)
                curveTo(4.482f, 7.0036f, 4.9897f, 6.88f, 5.7771f, 6.8156f)
                curveTo(5.9266f, 6.8034f, 6.0839f, 6.7935f, 6.25f, 6.7854f)
                verticalLineTo(10.831f)
                curveTo(6.25f, 11.2986f, 6.25f, 11.6821f, 6.2674f, 11.9839f)
                curveTo(6.2845f, 12.2816f, 6.3215f, 12.5899f, 6.4437f, 12.8652f)
                curveTo(6.8851f, 13.859f, 7.9741f, 14.3949f, 9.0309f, 14.1383f)
                curveTo(9.3236f, 14.0673f, 9.5904f, 13.9084f, 9.8367f, 13.7404f)
                curveTo(10.0864f, 13.57f, 10.3903f, 13.336f, 10.7608f, 13.0508f)
                lineTo(10.7793f, 13.0365f)
                curveTo(11.2486f, 12.6751f, 11.3808f, 12.5804f, 11.5019f, 12.5277f)
                curveTo(11.8196f, 12.3897f, 12.1804f, 12.3897f, 12.4981f, 12.5277f)
                curveTo(12.6192f, 12.5804f, 12.7513f, 12.6751f, 13.2207f, 13.0365f)
                lineTo(13.2392f, 13.0507f)
                curveTo(13.6097f, 13.336f, 13.9135f, 13.57f, 14.1633f, 13.7404f)
                curveTo(14.4096f, 13.9084f, 14.6764f, 14.0673f, 14.9691f, 14.1383f)
                curveTo(16.0259f, 14.3949f, 17.1149f, 13.859f, 17.5563f, 12.8652f)
                curveTo(17.6786f, 12.5899f, 17.7155f, 12.2816f, 17.7326f, 11.9839f)
                curveTo(17.75f, 11.6821f, 17.75f, 11.2985f, 17.75f, 10.831f)
                verticalLineTo(6.7854f)
                curveTo(17.9161f, 6.7935f, 18.0734f, 6.8034f, 18.2229f, 6.8156f)
                curveTo(19.0103f, 6.88f, 19.518f, 7.0036f, 19.9295f, 7.2132f)
                curveTo(20.7291f, 7.6207f, 21.3793f, 8.2709f, 21.7868f, 9.0705f)
                curveTo(21.8667f, 9.2273f, 21.934f, 9.3981f, 21.9904f, 9.5929f)
                curveTo(22.0f, 10.3192f, 22.0f, 11.1184f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(21.8433f, 6.7231f)
                curveTo(21.6699f, 5.2492f, 21.3048f, 4.2337f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.6952f, 4.2337f, 2.3301f, 5.2492f, 2.1567f, 6.7231f)
                curveTo(2.5268f, 6.3905f, 2.9408f, 6.1054f, 3.3895f, 5.8767f)
                curveTo(4.0477f, 5.5414f, 4.7748f, 5.3925f, 5.6549f, 5.3206f)
                curveTo(6.5193f, 5.25f, 7.5947f, 5.25f, 8.9664f, 5.25f)
                horizontalLineTo(15.0336f)
                curveTo(16.4053f, 5.25f, 17.4807f, 5.25f, 18.3451f, 5.3206f)
                curveTo(19.2252f, 5.3925f, 19.9523f, 5.5414f, 20.6104f, 5.8767f)
                curveTo(21.0592f, 6.1054f, 21.4732f, 6.3905f, 21.8433f, 6.7231f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.75f, 10.8076f)
                verticalLineTo(6.7523f)
                curveTo(8.1292f, 6.7501f, 8.5438f, 6.75f, 9.0f, 6.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4562f, 6.75f, 15.8708f, 6.7501f, 16.25f, 6.7523f)
                verticalLineTo(10.8076f)
                curveTo(16.25f, 11.3043f, 16.2497f, 11.6442f, 16.2351f, 11.8976f)
                curveTo(16.22f, 12.1601f, 16.1923f, 12.2408f, 16.1854f, 12.2563f)
                curveTo(16.0383f, 12.5876f, 15.6753f, 12.7662f, 15.323f, 12.6807f)
                curveTo(15.3066f, 12.6767f, 15.2257f, 12.6493f, 15.0085f, 12.5012f)
                curveTo(14.7989f, 12.3582f, 14.5294f, 12.151f, 14.1358f, 11.848f)
                lineTo(14.0688f, 11.7964f)
                curveTo(13.6986f, 11.5109f, 13.4101f, 11.2885f, 13.0958f, 11.152f)
                curveTo(12.3968f, 10.8483f, 11.6032f, 10.8483f, 10.9042f, 11.152f)
                curveTo(10.5899f, 11.2885f, 10.3014f, 11.511f, 9.9312f, 11.7964f)
                lineTo(9.8642f, 11.848f)
                curveTo(9.4706f, 12.151f, 9.2011f, 12.3582f, 8.9915f, 12.5012f)
                curveTo(8.7743f, 12.6493f, 8.6934f, 12.6767f, 8.677f, 12.6807f)
                curveTo(8.3247f, 12.7662f, 7.9617f, 12.5876f, 7.8146f, 12.2563f)
                curveTo(7.8077f, 12.2408f, 7.78f, 12.1601f, 7.7649f, 11.8976f)
                curveTo(7.7503f, 11.6442f, 7.75f, 11.3043f, 7.75f, 10.8076f)
                close()
            }
        }
            .build()
        return _bookmarkOpened!!
    }

private var _bookmarkOpened: ImageVector? = null
