package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.Armchair2: ImageVector
    get() {
        if (_armchair2 != null) {
            return _armchair2!!
        }
        _armchair2 = Builder(
            name = "Armchair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.7487f, 3.25f)
                horizontalLineTo(13.2513f)
                curveTo(14.339f, 3.25f, 15.2274f, 3.25f, 15.9287f, 3.3398f)
                curveTo(16.659f, 3.4333f, 17.2991f, 3.6357f, 17.8143f, 4.1264f)
                curveTo(18.3347f, 4.622f, 18.5542f, 5.2461f, 18.6548f, 5.9585f)
                curveTo(18.7501f, 6.6335f, 18.75f, 7.4858f, 18.75f, 8.5162f)
                verticalLineTo(9.5729f)
                curveTo(19.1507f, 9.3632f, 19.6072f, 9.25f, 20.0731f, 9.25f)
                curveTo(21.7812f, 9.25f, 23.2438f, 10.8073f, 22.6024f, 12.5265f)
                lineTo(21.483f, 15.5271f)
                curveTo(21.4752f, 15.548f, 21.4675f, 15.5687f, 21.4599f, 15.589f)
                curveTo(21.2871f, 16.0524f, 21.1687f, 16.3699f, 21.0076f, 16.6478f)
                curveTo(20.5101f, 17.5062f, 19.6991f, 18.1446f, 18.75f, 18.4812f)
                verticalLineTo(20.0f)
                curveTo(18.75f, 20.4142f, 18.4142f, 20.75f, 18.0f, 20.75f)
                curveTo(17.5858f, 20.75f, 17.25f, 20.4142f, 17.25f, 20.0f)
                verticalLineTo(18.7457f)
                curveTo(17.0624f, 18.7501f, 16.8493f, 18.75f, 16.5944f, 18.75f)
                lineTo(6.8798f, 18.75f)
                curveTo(6.8239f, 18.75f, 6.7881f, 18.75f, 6.7548f, 18.7495f)
                curveTo(6.7532f, 18.7495f, 6.7516f, 18.7495f, 6.75f, 18.7495f)
                verticalLineTo(20.0f)
                curveTo(6.75f, 20.4142f, 6.4142f, 20.75f, 6.0f, 20.75f)
                curveTo(5.5858f, 20.75f, 5.25f, 20.4142f, 5.25f, 20.0f)
                verticalLineTo(18.6667f)
                curveTo(5.25f, 18.6052f, 5.2574f, 18.5455f, 5.2713f, 18.4884f)
                curveTo(4.1301f, 18.0899f, 3.185f, 17.257f, 2.7439f, 16.1336f)
                curveTo(2.7322f, 16.1038f, 2.7203f, 16.0719f, 2.703f, 16.0256f)
                lineTo(1.3976f, 12.5265f)
                curveTo(0.7562f, 10.8073f, 2.2188f, 9.25f, 3.9269f, 9.25f)
                curveTo(4.3928f, 9.25f, 4.8493f, 9.3632f, 5.25f, 9.5729f)
                lineTo(5.25f, 8.5162f)
                curveTo(5.25f, 7.4858f, 5.2499f, 6.6335f, 5.3452f, 5.9585f)
                curveTo(5.4458f, 5.2461f, 5.6653f, 4.622f, 6.1857f, 4.1264f)
                curveTo(6.7009f, 3.6357f, 7.341f, 3.4333f, 8.0713f, 3.3398f)
                curveTo(8.7726f, 3.25f, 9.661f, 3.25f, 10.7487f, 3.25f)
                close()
                moveTo(5.25f, 11.9284f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.279f)
                lineTo(6.1402f, 14.122f)
                curveTo(6.1467f, 14.1382f, 6.1533f, 14.1544f, 6.1599f, 14.1707f)
                curveTo(6.2391f, 14.367f, 6.3218f, 14.5719f, 6.4486f, 14.7481f)
                curveTo(6.7367f, 15.1486f, 7.1729f, 15.412f, 7.6479f, 15.5085f)
                curveTo(7.8548f, 15.5505f, 8.0746f, 15.5503f, 8.3135f, 15.55f)
                curveTo(8.3314f, 15.55f, 8.3495f, 15.55f, 8.3676f, 15.55f)
                horizontalLineTo(15.3467f)
                curveTo(15.3822f, 15.55f, 15.4174f, 15.5501f, 15.4525f, 15.5501f)
                curveTo(15.9136f, 15.551f, 16.3443f, 15.5519f, 16.7241f, 15.3953f)
                curveTo(16.9307f, 15.3102f, 17.1228f, 15.1908f, 17.2897f, 15.0401f)
                curveTo(17.6062f, 14.7543f, 17.766f, 14.3571f, 17.9201f, 13.974f)
                curveTo(17.9325f, 13.9432f, 17.9449f, 13.9125f, 17.9572f, 13.882f)
                lineTo(18.721f, 12.0f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.9284f)
                lineTo(18.958f, 11.4159f)
                curveTo(19.1048f, 11.0542f, 19.5273f, 10.75f, 20.0731f, 10.75f)
                curveTo(20.9934f, 10.75f, 21.3868f, 11.4935f, 21.197f, 12.0022f)
                lineTo(20.0776f, 15.0028f)
                curveTo(19.8729f, 15.5514f, 19.7994f, 15.7411f, 19.7099f, 15.8956f)
                curveTo(19.3127f, 16.5808f, 18.5512f, 17.089f, 17.631f, 17.2184f)
                curveTo(17.4188f, 17.2482f, 17.1734f, 17.25f, 16.5332f, 17.25f)
                horizontalLineTo(6.8863f)
                curveTo(6.8221f, 17.25f, 6.7974f, 17.25f, 6.7758f, 17.2497f)
                curveTo(5.5393f, 17.2323f, 4.5112f, 16.5304f, 4.1401f, 15.5853f)
                curveTo(4.1337f, 15.569f, 4.1266f, 15.55f, 4.106f, 15.4948f)
                lineTo(2.803f, 12.0022f)
                curveTo(2.6132f, 11.4935f, 3.0066f, 10.75f, 3.9269f, 10.75f)
                curveTo(4.4727f, 10.75f, 4.8952f, 11.0542f, 5.042f, 11.4159f)
                lineTo(5.25f, 11.9284f)
                close()
                moveTo(17.25f, 11.6357f)
                verticalLineTo(8.5714f)
                curveTo(17.25f, 7.4717f, 17.2482f, 6.7261f, 17.1695f, 6.1682f)
                curveTo(17.0943f, 5.6358f, 16.9624f, 5.3865f, 16.7798f, 5.2126f)
                curveTo(16.5921f, 5.0338f, 16.315f, 4.9015f, 15.7382f, 4.8276f)
                curveTo(15.1434f, 4.7515f, 14.3516f, 4.75f, 13.2f, 4.75f)
                horizontalLineTo(10.8f)
                curveTo(9.6484f, 4.75f, 8.8566f, 4.7515f, 8.2618f, 4.8276f)
                curveTo(7.685f, 4.9015f, 7.4079f, 5.0338f, 7.2202f, 5.2126f)
                curveTo(7.0376f, 5.3865f, 6.9057f, 5.6358f, 6.8305f, 6.1682f)
                curveTo(6.7517f, 6.7261f, 6.75f, 7.4717f, 6.75f, 8.5714f)
                verticalLineTo(11.6357f)
                lineTo(7.5301f, 13.558f)
                curveTo(7.5825f, 13.6871f, 7.6128f, 13.7614f, 7.6382f, 13.8168f)
                curveTo(7.6559f, 13.8552f, 7.6644f, 13.8692f, 7.6663f, 13.8721f)
                curveTo(7.7164f, 13.9418f, 7.8114f, 14.0111f, 7.9464f, 14.0385f)
                curveTo(7.9852f, 14.0464f, 8.0411f, 14.05f, 8.3676f, 14.05f)
                horizontalLineTo(15.3467f)
                curveTo(15.9839f, 14.05f, 16.0854f, 14.0362f, 16.1526f, 14.0085f)
                curveTo(16.2058f, 13.9866f, 16.2499f, 13.958f, 16.2843f, 13.9269f)
                curveTo(16.2854f, 13.9259f, 16.3058f, 13.9103f, 16.3528f, 13.8179f)
                curveTo(16.4063f, 13.713f, 16.4656f, 13.5687f, 16.5673f, 13.318f)
                lineTo(17.25f, 11.6357f)
                close()
            }
        }
            .build()
        return _armchair2!!
    }

private var _armchair2: ImageVector? = null
