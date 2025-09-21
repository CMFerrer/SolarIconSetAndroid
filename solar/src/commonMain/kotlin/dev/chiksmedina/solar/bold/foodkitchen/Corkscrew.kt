package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.Corkscrew: ImageVector
    get() {
        if (_corkscrew != null) {
            return _corkscrew!!
        }
        _corkscrew = Builder(
            name = "Corkscrew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.357f, 8.3831f)
                curveTo(17.7511f, 8.6001f, 16.4767f, 9.8613f, 16.2398f, 11.4607f)
                lineTo(14.9198f, 10.1407f)
                lineTo(13.5955f, 11.4649f)
                curveTo(13.4826f, 11.5779f, 13.4619f, 11.7537f, 13.5457f, 11.8898f)
                lineTo(14.1916f, 12.9395f)
                curveTo(14.929f, 14.1378f, 13.499f, 15.4885f, 12.3446f, 14.684f)
                lineTo(7.727f, 11.4657f)
                lineTo(12.6712f, 18.5595f)
                curveTo(13.4816f, 19.7222f, 12.1075f, 21.1565f, 10.9111f, 20.3968f)
                lineTo(4.7955f, 16.5131f)
                lineTo(5.4448f, 17.8839f)
                curveTo(5.7783f, 18.588f, 5.6344f, 19.426f, 5.0826f, 19.9779f)
                lineTo(2.5303f, 22.5301f)
                curveTo(2.2374f, 22.823f, 1.7626f, 22.823f, 1.4697f, 22.5301f)
                curveTo(1.1768f, 22.2372f, 1.1768f, 21.7624f, 1.4697f, 21.4695f)
                lineTo(4.0219f, 18.9172f)
                curveTo(4.1246f, 18.8146f, 4.1519f, 18.6585f, 4.0892f, 18.5261f)
                lineTo(3.1399f, 16.5221f)
                curveTo(2.5831f, 15.3464f, 3.91f, 14.1739f, 5.0082f, 14.8713f)
                lineTo(10.8641f, 18.59f)
                lineTo(5.8481f, 11.3932f)
                curveTo(5.0199f, 10.2049f, 6.4662f, 8.7586f, 7.6546f, 9.5868f)
                lineTo(12.4044f, 12.8973f)
                lineTo(12.2682f, 12.6759f)
                curveTo(11.8204f, 11.9483f, 11.9307f, 11.0084f, 12.5349f, 10.4043f)
                lineTo(13.8591f, 9.08f)
                lineTo(10.518f, 5.7389f)
                curveTo(9.6626f, 4.8835f, 9.6626f, 3.4968f, 10.518f, 2.6415f)
                curveTo(11.3733f, 1.7862f, 12.76f, 1.7862f, 13.6153f, 2.6415f)
                lineTo(19.357f, 8.3831f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.3587f, 13.4823f)
                curveTo(21.7779f, 13.0631f, 21.9916f, 12.5164f, 21.9999f, 11.9671f)
                curveTo(21.9823f, 10.7949f, 21.0266f, 9.8501f, 19.8502f, 9.8501f)
                curveTo(18.6628f, 9.8501f, 17.7002f, 10.8127f, 17.7002f, 12.0001f)
                curveTo(17.7002f, 12.8162f, 18.1549f, 13.5261f, 18.8247f, 13.8903f)
                curveTo(19.6459f, 14.3039f, 20.6731f, 14.1679f, 21.3587f, 13.4823f)
                close()
            }
        }
            .build()
        return _corkscrew!!
    }

private var _corkscrew: ImageVector? = null
