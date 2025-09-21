package dev.chiksmedina.solar.outline.homefurniture

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
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Condicioner: ImageVector
    get() {
        if (_condicioner != null) {
            return _condicioner!!
        }
        _condicioner = Builder(
            name = "Condicioner", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.25f, 8.5f)
                curveTo(5.25f, 8.0858f, 5.5858f, 7.75f, 6.0f, 7.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 7.75f, 18.75f, 8.0858f, 18.75f, 8.5f)
                curveTo(18.75f, 8.9142f, 18.4142f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 9.25f, 5.25f, 8.9142f, 5.25f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 5.25f)
                curveTo(5.5858f, 5.25f, 5.25f, 5.5858f, 5.25f, 6.0f)
                curveTo(5.25f, 6.4142f, 5.5858f, 6.75f, 6.0f, 6.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 6.75f, 18.75f, 6.4142f, 18.75f, 6.0f)
                curveTo(18.75f, 5.5858f, 18.4142f, 5.25f, 18.0f, 5.25f)
                horizontalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5249f, 1.25f)
                horizontalLineTo(16.4751f)
                curveTo(17.6426f, 1.25f, 18.584f, 1.25f, 19.3334f, 1.3368f)
                curveTo(20.1086f, 1.4266f, 20.7734f, 1.6178f, 21.3381f, 2.0681f)
                curveTo(21.5576f, 2.2432f, 21.7568f, 2.4424f, 21.9319f, 2.6619f)
                curveTo(22.3822f, 3.2266f, 22.5734f, 3.8914f, 22.6632f, 4.6666f)
                curveTo(22.75f, 5.416f, 22.75f, 6.3573f, 22.75f, 7.5248f)
                verticalLineTo(7.6193f)
                curveTo(22.75f, 9.1881f, 22.75f, 10.431f, 22.6359f, 11.4157f)
                curveTo(22.5188f, 12.4263f, 22.2731f, 13.2601f, 21.7137f, 13.9616f)
                curveTo(21.4919f, 14.2397f, 21.2397f, 14.4919f, 20.9616f, 14.7137f)
                curveTo(20.2601f, 15.2731f, 19.4263f, 15.5188f, 18.4157f, 15.6359f)
                curveTo(17.431f, 15.75f, 16.1882f, 15.75f, 14.6194f, 15.75f)
                horizontalLineTo(9.3807f)
                curveTo(7.8119f, 15.75f, 6.569f, 15.75f, 5.5843f, 15.6359f)
                curveTo(4.5737f, 15.5188f, 3.7399f, 15.2731f, 3.0384f, 14.7137f)
                curveTo(2.7603f, 14.4919f, 2.5081f, 14.2397f, 2.2863f, 13.9616f)
                curveTo(1.7269f, 13.2601f, 1.4812f, 12.4263f, 1.3641f, 11.4157f)
                curveTo(1.25f, 10.431f, 1.25f, 9.1881f, 1.25f, 7.6193f)
                verticalLineTo(7.5249f)
                curveTo(1.25f, 6.3574f, 1.25f, 5.416f, 1.3368f, 4.6666f)
                curveTo(1.4266f, 3.8914f, 1.6178f, 3.2266f, 2.0681f, 2.6619f)
                curveTo(2.2432f, 2.4424f, 2.4424f, 2.2432f, 2.6619f, 2.0681f)
                curveTo(3.2266f, 1.6178f, 3.8914f, 1.4266f, 4.6666f, 1.3368f)
                curveTo(5.416f, 1.25f, 6.3574f, 1.25f, 7.5249f, 1.25f)
                close()
                moveTo(4.8393f, 2.8268f)
                curveTo(4.2023f, 2.9006f, 3.8531f, 3.0367f, 3.5972f, 3.2409f)
                curveTo(3.4654f, 3.3459f, 3.3459f, 3.4654f, 3.2409f, 3.5972f)
                curveTo(3.0367f, 3.8531f, 2.9006f, 4.2023f, 2.8268f, 4.8393f)
                curveTo(2.7512f, 5.4922f, 2.75f, 6.3464f, 2.75f, 7.5714f)
                curveTo(2.75f, 9.1988f, 2.7512f, 10.3548f, 2.8541f, 11.2431f)
                curveTo(2.9552f, 12.1154f, 3.1458f, 12.6336f, 3.459f, 13.0263f)
                curveTo(3.6108f, 13.2166f, 3.7834f, 13.3892f, 3.9737f, 13.541f)
                curveTo(4.2852f, 13.7894f, 4.6756f, 13.9607f, 5.259f, 14.0714f)
                curveTo(5.2743f, 13.6568f, 5.3186f, 13.287f, 5.4591f, 12.9476f)
                curveTo(5.7382f, 12.2738f, 6.2736f, 11.7384f, 6.9474f, 11.4593f)
                curveTo(7.2378f, 11.339f, 7.5373f, 11.2924f, 7.8544f, 11.2708f)
                curveTo(8.1591f, 11.25f, 8.5301f, 11.25f, 8.9746f, 11.25f)
                lineTo(15.5731f, 11.25f)
                curveTo(15.9658f, 11.2498f, 16.2688f, 11.2496f, 16.5363f, 11.3028f)
                curveTo(17.6272f, 11.5198f, 18.48f, 12.3726f, 18.697f, 13.4635f)
                curveTo(18.7329f, 13.644f, 18.7445f, 13.8406f, 18.7482f, 14.07f)
                curveTo(19.3276f, 13.9593f, 19.7161f, 13.7884f, 20.0263f, 13.541f)
                curveTo(20.2166f, 13.3892f, 20.3892f, 13.2166f, 20.541f, 13.0263f)
                curveTo(20.8542f, 12.6336f, 21.0448f, 12.1154f, 21.1459f, 11.2431f)
                curveTo(21.2488f, 10.3548f, 21.25f, 9.1988f, 21.25f, 7.5714f)
                curveTo(21.25f, 6.3464f, 21.2488f, 5.4922f, 21.1732f, 4.8393f)
                curveTo(21.0994f, 4.2023f, 20.9633f, 3.8531f, 20.7591f, 3.5972f)
                curveTo(20.6541f, 3.4654f, 20.5346f, 3.3459f, 20.4029f, 3.2409f)
                curveTo(20.1469f, 3.0367f, 19.7977f, 2.9006f, 19.1607f, 2.8268f)
                curveTo(18.5078f, 2.7512f, 17.6536f, 2.75f, 16.4286f, 2.75f)
                horizontalLineTo(7.5714f)
                curveTo(6.3464f, 2.75f, 5.4922f, 2.7512f, 4.8393f, 2.8268f)
                close()
                moveTo(17.2491f, 14.219f)
                curveTo(17.2474f, 13.9395f, 17.2417f, 13.8361f, 17.2258f, 13.7561f)
                curveTo(17.1272f, 13.2603f, 16.7395f, 12.8727f, 16.2437f, 12.774f)
                curveTo(16.1412f, 12.7536f, 16.0004f, 12.75f, 15.4998f, 12.75f)
                horizontalLineTo(8.9998f)
                curveTo(8.5236f, 12.75f, 8.204f, 12.7504f, 7.9566f, 12.7673f)
                curveTo(7.7158f, 12.7837f, 7.5986f, 12.8132f, 7.5215f, 12.8452f)
                curveTo(7.2152f, 12.972f, 6.9718f, 13.2154f, 6.845f, 13.5216f)
                curveTo(6.797f, 13.6375f, 6.7672f, 13.8037f, 6.7557f, 14.2192f)
                curveTo(7.4793f, 14.2495f, 8.3505f, 14.25f, 9.4286f, 14.25f)
                horizontalLineTo(14.5714f)
                curveTo(15.6519f, 14.25f, 16.5246f, 14.2495f, 17.2491f, 14.219f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4159f, 16.876f)
                curveTo(7.7605f, 17.1057f, 7.8536f, 17.5714f, 7.6239f, 17.916f)
                lineTo(7.3172f, 18.376f)
                curveTo(7.149f, 18.6283f, 7.2072f, 18.9681f, 7.4498f, 19.15f)
                curveTo(8.3293f, 19.8096f, 8.5403f, 21.0414f, 7.9305f, 21.9561f)
                lineTo(7.6239f, 22.416f)
                curveTo(7.3941f, 22.7607f, 6.9285f, 22.8538f, 6.5838f, 22.624f)
                curveTo(6.2392f, 22.3943f, 6.146f, 21.9286f, 6.3758f, 21.584f)
                lineTo(6.6824f, 21.124f)
                curveTo(6.8506f, 20.8717f, 6.7924f, 20.5319f, 6.5498f, 20.35f)
                curveTo(5.6704f, 19.6904f, 5.4594f, 18.4586f, 6.0692f, 17.5439f)
                lineTo(6.3758f, 17.084f)
                curveTo(6.6056f, 16.7393f, 7.0712f, 16.6462f, 7.4159f, 16.876f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.4159f, 16.876f)
                curveTo(12.7605f, 17.1057f, 12.8536f, 17.5714f, 12.6239f, 17.916f)
                lineTo(12.3172f, 18.376f)
                curveTo(12.149f, 18.6283f, 12.2072f, 18.9681f, 12.4498f, 19.15f)
                curveTo(13.3293f, 19.8096f, 13.5403f, 21.0414f, 12.9305f, 21.9561f)
                lineTo(12.6239f, 22.416f)
                curveTo(12.3941f, 22.7607f, 11.9285f, 22.8538f, 11.5838f, 22.624f)
                curveTo(11.2392f, 22.3943f, 11.146f, 21.9286f, 11.3758f, 21.584f)
                lineTo(11.6824f, 21.124f)
                curveTo(11.8506f, 20.8717f, 11.7924f, 20.5319f, 11.5498f, 20.35f)
                curveTo(10.6704f, 19.6904f, 10.4594f, 18.4586f, 11.0692f, 17.5439f)
                lineTo(11.3758f, 17.084f)
                curveTo(11.6056f, 16.7393f, 12.0712f, 16.6462f, 12.4159f, 16.876f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.4159f, 16.876f)
                curveTo(17.7605f, 17.1057f, 17.8536f, 17.5714f, 17.6239f, 17.916f)
                lineTo(17.3172f, 18.376f)
                curveTo(17.149f, 18.6283f, 17.2072f, 18.9681f, 17.4498f, 19.15f)
                curveTo(18.3293f, 19.8096f, 18.5403f, 21.0414f, 17.9305f, 21.9561f)
                lineTo(17.6239f, 22.416f)
                curveTo(17.3941f, 22.7607f, 16.9285f, 22.8538f, 16.5838f, 22.624f)
                curveTo(16.2392f, 22.3943f, 16.146f, 21.9286f, 16.3758f, 21.584f)
                lineTo(16.6824f, 21.124f)
                curveTo(16.8506f, 20.8717f, 16.7924f, 20.5319f, 16.5498f, 20.35f)
                curveTo(15.6704f, 19.6904f, 15.4594f, 18.4586f, 16.0692f, 17.5439f)
                lineTo(16.3758f, 17.084f)
                curveTo(16.6056f, 16.7393f, 17.0712f, 16.6462f, 17.4159f, 16.876f)
                close()
            }
        }
            .build()
        return _condicioner!!
    }

private var _condicioner: ImageVector? = null
