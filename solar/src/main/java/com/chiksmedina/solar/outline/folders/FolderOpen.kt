package com.chiksmedina.solar.outline.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoldersGroup

public val FoldersGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.8788f, 1.25f)
                curveTo(7.9054f, 1.25f, 7.9324f, 1.25f, 7.9598f, 1.25f)
                curveTo(7.971f, 1.25f, 7.982f, 1.25f, 7.9929f, 1.25f)
                curveTo(8.2706f, 1.25f, 8.4562f, 1.25f, 8.638f, 1.2659f)
                curveTo(9.4188f, 1.3344f, 10.1645f, 1.6222f, 10.777f, 2.0982f)
                curveTo(10.9198f, 2.2092f, 11.053f, 2.3341f, 11.2482f, 2.5171f)
                lineTo(11.2728f, 2.5402f)
                lineTo(11.713f, 2.9529f)
                curveTo(12.395f, 3.5923f, 12.6379f, 3.8112f, 12.9166f, 3.9566f)
                curveTo(13.082f, 4.0429f, 13.2583f, 4.1114f, 13.4419f, 4.1605f)
                curveTo(13.7546f, 4.2441f, 14.0998f, 4.25f, 15.0628f, 4.25f)
                lineTo(15.4086f, 4.25f)
                curveTo(16.4217f, 4.25f, 17.2481f, 4.25f, 17.9042f, 4.3273f)
                curveTo(18.5851f, 4.4076f, 19.1866f, 4.5806f, 19.6884f, 5.0037f)
                curveTo(19.7714f, 5.0737f, 19.8506f, 5.148f, 19.9257f, 5.2262f)
                curveTo(20.3856f, 5.7056f, 20.5781f, 6.2892f, 20.6664f, 6.9475f)
                curveTo(20.7501f, 7.5713f, 20.75f, 8.3537f, 20.75f, 9.2967f)
                verticalLineTo(11.3288f)
                curveTo(20.9639f, 11.5453f, 21.1507f, 11.7879f, 21.3064f, 12.051f)
                curveTo(21.7052f, 12.7249f, 21.7874f, 13.4837f, 21.7365f, 14.3501f)
                curveTo(21.687f, 15.1947f, 21.5018f, 16.2485f, 21.2703f, 17.5665f)
                lineTo(21.2551f, 17.6526f)
                curveTo(21.0892f, 18.5972f, 20.955f, 19.3614f, 20.7845f, 19.9677f)
                curveTo(20.6079f, 20.5956f, 20.374f, 21.1273f, 19.9657f, 21.5725f)
                curveTo(19.7721f, 21.7835f, 19.5551f, 21.971f, 19.3188f, 22.1311f)
                curveTo(18.8173f, 22.4708f, 18.2616f, 22.6162f, 17.6254f, 22.6845f)
                curveTo(17.0148f, 22.75f, 16.261f, 22.75f, 15.3362f, 22.75f)
                horizontalLineTo(8.6639f)
                curveTo(7.739f, 22.75f, 6.9853f, 22.75f, 6.3747f, 22.6845f)
                curveTo(5.7384f, 22.6162f, 5.1827f, 22.4708f, 4.6812f, 22.1311f)
                curveTo(4.4449f, 21.971f, 4.2279f, 21.7835f, 4.0344f, 21.5725f)
                curveTo(3.626f, 21.1273f, 3.3921f, 20.5956f, 3.2156f, 19.9677f)
                curveTo(3.0451f, 19.3613f, 2.9108f, 18.5972f, 2.7449f, 17.6525f)
                lineTo(2.7298f, 17.5664f)
                curveTo(2.4982f, 16.2485f, 2.3131f, 15.1947f, 2.2635f, 14.3501f)
                curveTo(2.2126f, 13.4837f, 2.2948f, 12.7249f, 2.6937f, 12.051f)
                curveTo(2.8494f, 11.7879f, 3.0362f, 11.5453f, 3.25f, 11.3288f)
                verticalLineTo(5.7123f)
                curveTo(3.25f, 5.6834f, 3.25f, 5.6548f, 3.25f, 5.6267f)
                curveTo(3.2498f, 5.0476f, 3.2497f, 4.6462f, 3.3202f, 4.2958f)
                curveTo(3.6302f, 2.7559f, 4.9026f, 1.5918f, 6.4761f, 1.3135f)
                curveTo(6.8361f, 1.2498f, 7.2506f, 1.2499f, 7.8788f, 1.25f)
                close()
                moveTo(4.75f, 10.4912f)
                curveTo(4.9905f, 10.4287f, 5.2437f, 10.384f, 5.5091f, 10.3511f)
                curveTo(6.3253f, 10.25f, 7.3639f, 10.25f, 8.6544f, 10.25f)
                horizontalLineTo(15.3456f)
                curveTo(16.6361f, 10.25f, 17.6747f, 10.25f, 18.4909f, 10.3511f)
                curveTo(18.7563f, 10.384f, 19.0096f, 10.4287f, 19.25f, 10.4912f)
                verticalLineTo(9.3484f)
                curveTo(19.25f, 8.3404f, 19.2484f, 7.6593f, 19.1797f, 7.1469f)
                curveTo(19.1141f, 6.6576f, 18.9988f, 6.4268f, 18.8432f, 6.2646f)
                curveTo(18.805f, 6.2248f, 18.7644f, 6.1867f, 18.7215f, 6.1505f)
                curveTo(18.5389f, 5.9965f, 18.2717f, 5.881f, 17.7286f, 5.817f)
                curveTo(17.1707f, 5.7512f, 16.4331f, 5.75f, 15.3617f, 5.75f)
                horizontalLineTo(15.0628f)
                curveTo(15.0292f, 5.75f, 14.9961f, 5.75f, 14.9635f, 5.75f)
                curveTo(14.1359f, 5.7502f, 13.5813f, 5.7504f, 13.0547f, 5.6097f)
                curveTo(12.7659f, 5.5325f, 12.4867f, 5.4242f, 12.2229f, 5.2866f)
                curveTo(11.7396f, 5.0345f, 11.3423f, 4.6618f, 10.7589f, 4.1146f)
                curveTo(10.7353f, 4.0924f, 10.7113f, 4.0699f, 10.6871f, 4.0472f)
                lineTo(10.2469f, 3.6345f)
                curveTo(10.0181f, 3.4201f, 9.9377f, 3.3457f, 9.8566f, 3.2826f)
                curveTo(9.4779f, 2.9883f, 9.0079f, 2.8041f, 8.507f, 2.7602f)
                curveTo(8.3986f, 2.7507f, 8.2822f, 2.75f, 7.9598f, 2.75f)
                curveTo(7.2217f, 2.75f, 6.9503f, 2.7529f, 6.7374f, 2.7906f)
                curveTo(5.722f, 2.9702f, 4.9693f, 3.7046f, 4.7908f, 4.5918f)
                curveTo(4.7537f, 4.7758f, 4.75f, 5.0142f, 4.75f, 5.7123f)
                verticalLineTo(10.4912f)
                close()
                moveTo(5.6936f, 11.8397f)
                curveTo(4.996f, 11.9262f, 4.6364f, 12.0845f, 4.3884f, 12.3139f)
                curveTo(4.2317f, 12.4589f, 4.0954f, 12.6276f, 3.9845f, 12.815f)
                curveTo(3.8053f, 13.1179f, 3.7177f, 13.5265f, 3.7609f, 14.2622f)
                curveTo(3.8048f, 15.0099f, 3.9737f, 15.978f, 4.2154f, 17.3541f)
                curveTo(4.3898f, 18.3468f, 4.5119f, 19.0364f, 4.6596f, 19.5616f)
                curveTo(4.8035f, 20.0735f, 4.9531f, 20.355f, 5.1398f, 20.5585f)
                curveTo(5.2551f, 20.6842f, 5.3835f, 20.7951f, 5.5225f, 20.8892f)
                curveTo(5.7442f, 21.0394f, 6.0301f, 21.1389f, 6.5347f, 21.1931f)
                curveTo(7.0559f, 21.249f, 7.729f, 21.25f, 8.7053f, 21.25f)
                horizontalLineTo(15.2947f)
                curveTo(16.2711f, 21.25f, 16.9441f, 21.249f, 17.4653f, 21.1931f)
                curveTo(17.9699f, 21.1389f, 18.2559f, 21.0394f, 18.4776f, 20.8892f)
                curveTo(18.6165f, 20.7951f, 18.745f, 20.6842f, 18.8603f, 20.5585f)
                curveTo(19.047f, 20.355f, 19.1965f, 20.0735f, 19.3405f, 19.5616f)
                curveTo(19.4882f, 19.0364f, 19.6102f, 18.3468f, 19.7846f, 17.3541f)
                curveTo(20.0263f, 15.978f, 20.1952f, 15.0099f, 20.2391f, 14.2622f)
                curveTo(20.2823f, 13.5265f, 20.1948f, 13.1179f, 20.0155f, 12.815f)
                curveTo(19.9046f, 12.6276f, 19.7684f, 12.4589f, 19.6116f, 12.3139f)
                curveTo(19.3637f, 12.0845f, 19.004f, 11.9262f, 18.3064f, 11.8397f)
                curveTo(17.5934f, 11.7514f, 16.648f, 11.75f, 15.2947f, 11.75f)
                horizontalLineTo(8.7053f)
                curveTo(7.352f, 11.75f, 6.4067f, 11.7514f, 5.6936f, 11.8397f)
                close()
                moveTo(9.25f, 17.0f)
                curveTo(9.25f, 16.5858f, 9.5858f, 16.25f, 10.0f, 16.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 16.25f, 14.75f, 16.5858f, 14.75f, 17.0f)
                curveTo(14.75f, 17.4142f, 14.4142f, 17.75f, 14.0f, 17.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 17.75f, 9.25f, 17.4142f, 9.25f, 17.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
