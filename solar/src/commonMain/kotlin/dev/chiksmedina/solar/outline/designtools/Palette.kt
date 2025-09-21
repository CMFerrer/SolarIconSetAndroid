package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(
            name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.9686f, 1.25f)
                horizontalLineTo(6.0314f)
                curveTo(6.7048f, 1.25f, 7.2555f, 1.25f, 7.7031f, 1.2866f)
                curveTo(8.1663f, 1.3244f, 8.5847f, 1.4051f, 8.9755f, 1.6042f)
                curveTo(9.587f, 1.9158f, 10.0842f, 2.413f, 10.3958f, 3.0245f)
                curveTo(10.5949f, 3.4153f, 10.6756f, 3.8337f, 10.7134f, 4.2969f)
                curveTo(10.75f, 4.7445f, 10.75f, 5.2952f, 10.75f, 5.9686f)
                verticalLineTo(6.432f)
                lineTo(12.8055f, 4.3765f)
                curveTo(13.2817f, 3.9003f, 13.6711f, 3.5109f, 14.0134f, 3.2203f)
                curveTo(14.3678f, 2.9195f, 14.7207f, 2.6807f, 15.1378f, 2.5452f)
                curveTo(15.7905f, 2.3331f, 16.4937f, 2.3331f, 17.1464f, 2.5452f)
                curveTo(17.5635f, 2.6807f, 17.9164f, 2.9195f, 18.2708f, 3.2203f)
                curveTo(18.6131f, 3.5109f, 19.0025f, 3.9003f, 19.4786f, 4.3764f)
                lineTo(19.5231f, 4.4209f)
                curveTo(19.9992f, 4.8971f, 20.3886f, 5.2865f, 20.6793f, 5.6288f)
                curveTo(20.9801f, 5.9831f, 21.2188f, 6.3361f, 21.3543f, 6.7531f)
                curveTo(21.5664f, 7.4059f, 21.5664f, 8.109f, 21.3543f, 8.7618f)
                curveTo(21.2188f, 9.1788f, 20.9801f, 9.5318f, 20.6793f, 9.8861f)
                curveTo(20.3886f, 10.2284f, 19.9992f, 10.6178f, 19.5231f, 11.0939f)
                lineTo(17.367f, 13.25f)
                horizontalLineTo(18.0314f)
                curveTo(18.7048f, 13.25f, 19.2555f, 13.25f, 19.7031f, 13.2866f)
                curveTo(20.1663f, 13.3244f, 20.5847f, 13.4051f, 20.9755f, 13.6042f)
                curveTo(21.587f, 13.9158f, 22.0842f, 14.413f, 22.3958f, 15.0245f)
                curveTo(22.5949f, 15.4153f, 22.6756f, 15.8337f, 22.7134f, 16.2969f)
                curveTo(22.75f, 16.7445f, 22.75f, 17.2952f, 22.75f, 17.9686f)
                verticalLineTo(18.0314f)
                curveTo(22.75f, 18.7048f, 22.75f, 19.2555f, 22.7134f, 19.7031f)
                curveTo(22.6756f, 20.1663f, 22.5949f, 20.5847f, 22.3958f, 20.9755f)
                curveTo(22.0842f, 21.587f, 21.587f, 22.0842f, 20.9755f, 22.3958f)
                curveTo(20.5847f, 22.5949f, 20.1663f, 22.6756f, 19.7031f, 22.7134f)
                curveTo(19.2555f, 22.75f, 18.7048f, 22.75f, 18.0314f, 22.75f)
                horizontalLineTo(6.0873f)
                curveTo(6.0688f, 22.75f, 6.0502f, 22.75f, 6.0314f, 22.75f)
                horizontalLineTo(5.9686f)
                curveTo(5.2952f, 22.75f, 4.7445f, 22.75f, 4.2969f, 22.7134f)
                curveTo(3.8337f, 22.6756f, 3.4153f, 22.5949f, 3.0245f, 22.3958f)
                curveTo(2.413f, 22.0842f, 1.9158f, 21.587f, 1.6042f, 20.9755f)
                curveTo(1.4051f, 20.5847f, 1.3244f, 20.1663f, 1.2866f, 19.7031f)
                curveTo(1.25f, 19.2555f, 1.25f, 18.7048f, 1.25f, 18.0314f)
                verticalLineTo(5.9686f)
                curveTo(1.25f, 5.2952f, 1.25f, 4.7445f, 1.2866f, 4.2969f)
                curveTo(1.3244f, 3.8337f, 1.4051f, 3.4153f, 1.6042f, 3.0245f)
                curveTo(1.9158f, 2.413f, 2.413f, 1.9158f, 3.0245f, 1.6042f)
                curveTo(3.4153f, 1.4051f, 3.8337f, 1.3244f, 4.2969f, 1.2866f)
                curveTo(4.7445f, 1.25f, 5.2952f, 1.25f, 5.9686f, 1.25f)
                close()
                moveTo(10.2386f, 21.25f)
                horizontalLineTo(18.0f)
                curveTo(18.7124f, 21.25f, 19.2017f, 21.2494f, 19.5809f, 21.2184f)
                curveTo(19.9514f, 21.1882f, 20.1504f, 21.1327f, 20.2945f, 21.0593f)
                curveTo(20.6238f, 20.8915f, 20.8915f, 20.6238f, 21.0593f, 20.2945f)
                curveTo(21.1327f, 20.1504f, 21.1882f, 19.9514f, 21.2184f, 19.5809f)
                curveTo(21.2494f, 19.2017f, 21.25f, 18.7124f, 21.25f, 18.0f)
                curveTo(21.25f, 17.2876f, 21.2494f, 16.7983f, 21.2184f, 16.4191f)
                curveTo(21.1882f, 16.0486f, 21.1327f, 15.8496f, 21.0593f, 15.7055f)
                curveTo(20.8915f, 15.3762f, 20.6238f, 15.1085f, 20.2945f, 14.9407f)
                curveTo(20.1504f, 14.8673f, 19.9514f, 14.8118f, 19.5809f, 14.7816f)
                curveTo(19.2017f, 14.7506f, 18.7124f, 14.75f, 18.0f, 14.75f)
                horizontalLineTo(15.867f)
                lineTo(10.6912f, 19.9258f)
                curveTo(10.6462f, 20.3018f, 10.5625f, 20.6483f, 10.3958f, 20.9755f)
                curveTo(10.3477f, 21.0698f, 10.2952f, 21.1614f, 10.2386f, 21.25f)
                close()
                moveTo(10.75f, 17.7457f)
                lineTo(18.4402f, 10.0555f)
                curveTo(18.944f, 9.5518f, 19.2895f, 9.2054f, 19.5357f, 8.9153f)
                curveTo(19.7763f, 8.632f, 19.8778f, 8.452f, 19.9278f, 8.2982f)
                curveTo(20.042f, 7.9467f, 20.042f, 7.5681f, 19.9278f, 7.2167f)
                curveTo(19.8778f, 7.0629f, 19.7763f, 6.8829f, 19.5357f, 6.5995f)
                curveTo(19.2895f, 6.3095f, 18.944f, 5.9631f, 18.4402f, 5.4593f)
                curveTo(17.9364f, 4.9556f, 17.5901f, 4.6101f, 17.3f, 4.3638f)
                curveTo(17.0166f, 4.1232f, 16.8366f, 4.0217f, 16.6829f, 3.9718f)
                curveTo(16.3314f, 3.8576f, 15.9528f, 3.8576f, 15.6013f, 3.9718f)
                curveTo(15.4476f, 4.0217f, 15.2676f, 4.1232f, 14.9842f, 4.3638f)
                curveTo(14.6941f, 4.6101f, 14.3478f, 4.9556f, 13.844f, 5.4593f)
                lineTo(11.7019f, 7.6014f)
                curveTo(11.0806f, 8.2228f, 10.927f, 8.3951f, 10.8452f, 8.5927f)
                curveTo(10.7637f, 8.7895f, 10.7501f, 9.0186f, 10.75f, 9.8868f)
                curveTo(10.75f, 9.891f, 10.75f, 9.8953f, 10.75f, 9.8995f)
                lineTo(10.75f, 17.7457f)
                close()
                moveTo(9.25f, 18.0413f)
                curveTo(9.25f, 18.7314f, 9.2488f, 19.209f, 9.2184f, 19.5809f)
                curveTo(9.1882f, 19.9514f, 9.1327f, 20.1504f, 9.0593f, 20.2945f)
                curveTo(8.8915f, 20.6238f, 8.6238f, 20.8915f, 8.2945f, 21.0593f)
                curveTo(8.1504f, 21.1327f, 7.9514f, 21.1882f, 7.5809f, 21.2184f)
                curveTo(7.2017f, 21.2494f, 6.7124f, 21.25f, 6.0f, 21.25f)
                curveTo(5.2876f, 21.25f, 4.7983f, 21.2494f, 4.4191f, 21.2184f)
                curveTo(4.0486f, 21.1882f, 3.8496f, 21.1327f, 3.7055f, 21.0593f)
                curveTo(3.3762f, 20.8915f, 3.1085f, 20.6238f, 2.9407f, 20.2945f)
                curveTo(2.8674f, 20.1504f, 2.8118f, 19.9514f, 2.7816f, 19.5809f)
                curveTo(2.7506f, 19.2017f, 2.75f, 18.7124f, 2.75f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.75f, 5.2876f, 2.7506f, 4.7983f, 2.7816f, 4.4191f)
                curveTo(2.8118f, 4.0486f, 2.8674f, 3.8496f, 2.9407f, 3.7055f)
                curveTo(3.1085f, 3.3762f, 3.3762f, 3.1085f, 3.7055f, 2.9407f)
                curveTo(3.8496f, 2.8674f, 4.0486f, 2.8118f, 4.4191f, 2.7816f)
                curveTo(4.7983f, 2.7506f, 5.2876f, 2.75f, 6.0f, 2.75f)
                curveTo(6.7124f, 2.75f, 7.2017f, 2.7506f, 7.5809f, 2.7816f)
                curveTo(7.9514f, 2.8118f, 8.1504f, 2.8674f, 8.2945f, 2.9407f)
                curveTo(8.6238f, 3.1085f, 8.8915f, 3.3762f, 9.0593f, 3.7055f)
                curveTo(9.1327f, 3.8496f, 9.1882f, 4.0486f, 9.2184f, 4.4191f)
                curveTo(9.2494f, 4.7983f, 9.25f, 5.2876f, 9.25f, 6.0f)
                verticalLineTo(9.5492f)
                curveTo(9.2498f, 9.624f, 9.2499f, 9.7004f, 9.2499f, 9.7787f)
                curveTo(9.25f, 9.8185f, 9.25f, 9.8588f, 9.25f, 9.8995f)
                lineTo(9.25f, 18.0f)
                curveTo(9.25f, 18.0138f, 9.25f, 18.0276f, 9.25f, 18.0413f)
                close()
                moveTo(4.25f, 19.0f)
                curveTo(4.25f, 18.5858f, 4.5858f, 18.25f, 5.0f, 18.25f)
                horizontalLineTo(7.0f)
                curveTo(7.4142f, 18.25f, 7.75f, 18.5858f, 7.75f, 19.0f)
                curveTo(7.75f, 19.4142f, 7.4142f, 19.75f, 7.0f, 19.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 19.75f, 4.25f, 19.4142f, 4.25f, 19.0f)
                close()
            }
        }
            .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
